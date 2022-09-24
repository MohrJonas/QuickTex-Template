#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}

#end
import mohr.jonas.quick.tex.Document
import mohr.jonas.quick.tex.dsl.TextFormat.*
import mohr.jonas.quick.tex.dsl.elements.latex.*
import mohr.jonas.quick.tex.dsl.elements.math.*
import mohr.jonas.quick.tex.dsl.elements.tikz.ArrowType.*
import mohr.jonas.quick.tex.dsl.elements.tikz.Colors.*
import mohr.jonas.quick.tex.dsl.elements.tikz.commands.*
import mohr.jonas.quick.tex.dsl.elements.tikz.pgfplots.*
import mohr.jonas.quick.tex.dsl.elements.tikz.*
import mohr.jonas.quick.tex.dsl.elements.tikz.commands.*

class ${NAME} : Document {

    override fun get() = qt {
        pre {
            pkg("tikz")
            pkg("babel", "ngerman")
            pkg("ulem")
            pkg("mathtools")
            pkg("amsmath")
            pkg("pgfplots")
            pkg("circuitikz")
            raw("\\pgfplotsset{compat=1.18}")
        }
        d {
            p {
                title()
            }
        }
    }
}