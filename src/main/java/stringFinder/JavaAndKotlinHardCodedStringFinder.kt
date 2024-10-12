package stringFinder

import ui.theRemov

class JavaAndKotlinHardCodedStringFinder : HardCodedStringFinder() {

    override fun shouldInclude(it: String): Boolean {
        return it.isNotBlank() && !Regex(theRemov).matches(it)
    }

    override fun regex() = Regex("\".*?\"")

    override fun extractHardCodedString(it: String) = it.replace("\"", "")

}