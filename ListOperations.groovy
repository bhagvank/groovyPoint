package com.javacodegeeks.groovy.list

class GroovyLookupItems {

	static main(args) {
		def cartoons = [
				'Regular Show',
				'The Amazing World of Gumball',
				'Adventure Time',
				'Uncle Grandpa',
				'Batman',
				'Scooby Doo'
			]
		def scoobyDoo = cartoons.find { it == 'Scooby Doo' }
		println scoobyDoo // Scooby Doo
		
		def cartoonNamesWithSizeGreaterThan12 = cartoons.findAll { it.size() > 12 }
		println cartoonNamesWithSizeGreaterThan12 // [The Amazing World of Gumball, Adventure Time, Uncle Grandpa]
		
		def cartoonNamesWithSizeGreaterThan15 = cartoons.findAll { cartoon -> cartoon.size() > 15 }
		println cartoonNamesWithSizeGreaterThan15 // [The Amazing World of Gumball]
		
		def cartoonsFoundWithRegex = cartoons.findAll { it =~ /an/ }
		println cartoonsFoundWithRegex // [Uncle Grandpa, Batman]
		
		def cartoonIndexList = cartoons.findIndexOf { it =~ /^A/ }
		println cartoonIndexList // 2
		
		def cartoonIndexListWithStartPoint = cartoons.findIndexOf(4) { it =~ /^A/ }
		println cartoonIndexListWithStartPoint // -1
		
		def cartoonLastIndex = cartoons.findLastIndexOf { it.size() > 10 }
		println cartoonLastIndex // 3
	}

}
