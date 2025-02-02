public class Myname {

	static String displayPatternA(int line, int size){
		int spaces, symbols;
		String pattern = "";
		if(size%2 == 1){
			size = size;
		}
		else{
			size = size+1;
		}
		
				for(spaces = size-((size/2)+line); spaces > 0; spaces--){
					pattern += " ";
				}
				if(line == 1){
					pattern += "*";
				}
				else if(line <= size/2){
					pattern += "*";
					for(spaces = 2*line-3; spaces > 0; spaces--){
						pattern += " ";
					}
					pattern += "*";
				}
				else if(line == (size/2)+1){
					for(symbols = size; symbols > 0; symbols--){
						if(symbols%2 == 1){
							pattern += "*";
						}
						else{
							pattern += " ";
						}
					}
				}	
				else{
					pattern += "*";
					for(symbols = size-2; symbols > 0; symbols--){
						pattern += " ";
					}
					pattern += "*";
				}
				for(spaces = size-((size/2)+line); spaces > 0; spaces--){
					pattern += " ";
				}
				
				pattern += " ";
				return pattern;
	}
	
	static String displayPatternY(int line, int size){
		int spaces;
		String pattern = "";
		
		if(size%2 == 1){
			if(line <= size/2){
				for(spaces = line-1; spaces > 0; spaces--){
					pattern += " ";
				}
				pattern += "*";
				for(spaces = size-2*line; spaces > 0; spaces--){
					pattern += " ";
				}
				pattern += "*";
				for(spaces = line-1; spaces > 0; spaces--){
					pattern += " ";
				}
			}
			else{
				for(spaces = size/2; spaces > 0; spaces--){
					pattern += " ";
				}
				pattern += "*";
				for(spaces = size/2; spaces > 0; spaces--){
					pattern += " ";
				}
			}
		}
		else{
			if(line <= size/2){
				for(spaces = line-1; spaces > 0; spaces--){
					pattern += " ";
				}
				pattern += "*";
				for(spaces = (size+1)-2*line; spaces > 0; spaces--){
					pattern += " ";
				}
				pattern += "*";
				for(spaces = line-1; spaces > 0; spaces--){
					pattern += " ";
				}
			}
			else{
				for(spaces = size/2; spaces > 0; spaces--){
					pattern += " ";
				}
				pattern += "*";
				for(spaces = size/2; spaces > 0; spaces--){
					pattern += " ";
				}
			}
		}
		pattern += "  ";
		return pattern;
	}
	
	static String displayPatternU(int line, int size){
		int spaces, symbols;
		String pattern = "";
		if(size%2 == 1){
				if(line < size){
					pattern += "*";
					for(spaces = size-2; spaces > 0; spaces--){
						pattern += " ";
					}
					pattern += "*";
				}
				else{
					for(symbols = size; symbols > 0; symbols--){
						if(symbols%2 == 0){
							pattern += "*";
						}
						else{
							pattern += " ";
						}
					}
				}
		}	
		else{
				if(line < size){
					pattern += "*";
					for(spaces = size-1; spaces > 0; spaces--){
						pattern += " ";
					}
					pattern += "*";
				}
				else{
					for(symbols = size+1; symbols > 0; symbols--){
						if(symbols%2 == 1){
							pattern += " ";
						}
						else{
							pattern += "*";
						}
					}
				}
		}
		pattern += "  ";
		return pattern;
	}


	
	static String displayPatternS(int line, int size){ 
		int spaces, symbols;
		String pattern = "";
		if(size%2 == 0){
			size++;
		}
		else{
			size = size;
		}
			if(line == 1 || line == (size/2)+1 || line == size){
				for(symbols = size; symbols > 0; symbols--){
					if(symbols%2 == 0){
						pattern += "*";
					}
					else{
						pattern += " ";
					}
				}
			}
			else if(line == 2 || line == size-1){
				pattern += "*";
				for(spaces = size-2; spaces > 0; spaces--){
					pattern += " ";
				}
				pattern += "*";
			}
			else if(line > (size/2)+1){
				for(spaces = size-1; spaces > 0; spaces--){
					pattern += " ";
				}
				pattern += "*";
			}
			else{
				pattern += "*";
				for(spaces = size-1; spaces > 0; spaces--){
					pattern += " ";
				}
			}
			pattern += "  ";
			return pattern;
	}
	
	static String displayPatternH(int line, int size){ 
		String pattern = "";
		int spaces, symbols;
		if(size%2 == 0){
			size++; 
		}
			if(line == (size/2)+1){
				for(symbols = size; symbols > 0; symbols--){
					if(symbols%2 == 1){
						pattern += "*";
					}
					else{
						pattern += " ";
					}
				}
			}	
			else{
				pattern += "*";
				for(spaces = size-2; spaces > 0; spaces--){
					pattern += " ";
				}
				pattern += "*";
			}
			pattern += "  ";
			return pattern;
	}
	
	static String displayPatternI(int line, int size){
		String pattern = "";
		int spaces, symbols;
		if(size%2 == 0){
			size++; 
		}
			for(symbols = size; symbols > 0; symbols--){
				if(line == 1 || line == size){
					if(symbols%2 == 1){
						pattern += "*";
					}
					else{
						pattern += " ";
					}	
				}
				else if(symbols == (size/2)+1){
					pattern += "*";
				}
				else{
					pattern += " ";
				}
			}
			pattern += "  ";
			return pattern;
	}
	
	static String displayPatternJ(int line, int size){
		String pattern = "";
		int spaces, symbols;
		if(size%2 == 0){
			size++;
		}
			for(symbols = size; symbols > 0; symbols--){
				if(line == 1){
					if(symbols%2 == 1){
						pattern += "*";
					}
					else{
						pattern += " ";
					}	
				}
				else if(symbols == (size/2)+1){
					pattern += "*";
				}
				else if(line == size){
					if(symbols > (size/2)+1){
						if(symbols%2 == 1){
							pattern += "*";
						}
						else{
							pattern += " ";
						}
					}
					else{
						pattern += " ";
					}
				}
				else if(line == size-1){
					if(symbols == size){
						pattern += "*";
					}
					else{
						pattern += " ";
					}
				}
				else{
					pattern += " ";
				}
			}
			pattern += "  ";
			return pattern;	
	}
	
	static String displayPatternO(int line, int size){
		String pattern = "";
		int spaces, symbols;
		if(size%2 == 0){
			size++;
		}
		for(symbols = size; symbols > 0; symbols--){
			if(line == 1 || line == size){
				if(symbols%2 == 1){
					pattern += " ";
				}
				else{
					pattern += "*";
				}	
			}
			else if(symbols == size || symbols == 1){
				pattern += "*";
			}
			else{
				pattern += " ";
			}
		}
		pattern += "  ";
		return pattern;
	}
	
	public static void main (String[] args){
        if (args.length == 0) {
            System.out.println("Provide Atleast one Argument.");
            return;
        }
        String args1 = args[0].toUpperCase(); 
       // String args2 = args[1].toUpperCase();
        int length1 = args1.length();
       // int length2 = args2.length(); 
        int size = 7;
       
        for(int line = 1; line <= size; line++){
            for(int i = 0; i < length1; i++){
                char ch1 = args1.charAt(i);
                switch (ch1) {
                    case 'A':
                        System.out.print(displayPatternA(line, size));
                        break;
                    case 'Y':
                        System.out.print(displayPatternY(line, size));
                        break;
					case 'U':
                        System.out.print(displayPatternU(line, size));
                        break;
                    case 'S':
                        System.out.print(displayPatternS(line, size));
                        break;
                    case 'H':
                        System.out.print(displayPatternH(line, size));
                        break;
                    case 'I':
                        System.out.print(displayPatternI(line, size));
                        break;
                    case 'J':
                        System.out.print(displayPatternJ(line, size));
                        break;
                    case 'O':
                        System.out.print(displayPatternO(line, size));
                        break;
                    default:
                        System.out.print(" ");
                        break;
                }
            }
            System.out.println();
        }
        System.out.println();
            
       /* for(int line = 1; line <= size; line++){
		    for(int j = 0; j < length2; j++){
		         char ch2 = args2.charAt(j);
		         switch (ch2) {
		             case 'A':
		                 System.out.print(displayPatternA(line, size));
		                 break;
		             case 'Y':
		                 System.out.print(displayPatternY(line, size));
		                 break;
			   		 case 'U':
		                 System.out.print(displayPatternU(line, size));
		                 break;
		             case 'S':
		                 System.out.print(displayPatternS(line, size));
	                     break;
	                 case 'H':
		                 System.out.print(displayPatternH(line, size));
		                 break;
		             case 'I':
		                 System.out.print(displayPatternI(line, size));
		                 break;
	                 case 'J':
		                 System.out.print(displayPatternJ(line, size));
		                 break;
		             case 'O':
		                 System.out.print(displayPatternO(line, size));
	                     break;
	                 default:
		                 System.out.print(" ");
		                 break;
		         }
             }
             System.out.println();
         }*/
	}
}
