package c_statment;

import java.util.*;

public class SimLitest {

	public static void main(String[] args) {
		
		System.out.println("나의 연애 유형은?(시작 : Y, 종료 : N");
		System.out.println();
		System.out.println("(맞으면 yes, 틀리면 no를 입력해주세요!)");

		Scanner s = new Scanner(System.in);

			
		System.out.println("나는 금사빠다.");
		String yn = s.nextLine();
		
		
		if(yn.equals("Y")){
			System.out.println("연애할때 끌려다니는 타입이다.");
			yn =s.nextLine();
			
			if(yn.equals("Y")){
				System.out.println("감정표현에 솔직한 편이다.");
				yn =s.nextLine();
				
				if(yn.equals("Y")){
					System.out.println("이성친구는 존재할 수 없다.");
					yn =s.nextLine();
					
					if(yn.equals("Y")){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						yn =s.nextLine();
						
						if(yn.equals("Y")){
						System.out.println("D, 다퍼주는 연애를 하는 타입");
						yn =s.nextLine();

							
						}else if(yn.equals("N")){
						System.out.println("C, 친구같이 편안한 연애를 하는 타입");
						yn =s.nextLine();

						}
						
					
					}else if(yn.equals("N")){
						System.out.println("B, 자유로운 연애를 하는 타입");
						yn =s.nextLine();
					}
				
					}else if(yn.equals("N")){
					System.out.println("활동적인 데이트가 좋다");
					yn =s.nextLine();
					
				
						if(yn.equals("Y")){
						System.out.println("이성친구는 존재할 수 없다.");
						yn =s.nextLine();
						
							if(yn.equals("N")){
							System.out.println("B, 자유로운 연애를 하는 타입");
							yn =s.nextLine();

							
							}else if(yn.equals("N")){
								System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
								yn =s.nextLine();
						
							
								if(yn.equals("Y")){
									System.out.println("D, 다퍼주는 연애를 하는 타입");
									yn =s.nextLine();
								
								}else if(yn.equals("N")){
									System.out.println("C, 친구같이 편안한 연애를 하는 타입");
									yn =s.nextLine();

								}
							}
						}
					}
		}else if(yn.equals("N")){
		System.out.println("데이트 코스는 미리 짜는 게 편하다.");
		yn =s.nextLine();

			
			if(yn.equals("N")){
			System.out.println("감정표현에 솔직한 편이다.");
			yn =s.nextLine();
			
				if(yn.equals("Y")){
				System.out.println("이성친구는 존재할 수 없다.");
				yn =s.nextLine();
				
					if(yn.equals("Y")){
					System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
					yn =s.nextLine();
					
						if(yn.equals("Y")){
						System.out.println("D, 다퍼주는 연애를 하는 타입");
						yn =s.nextLine();

							
						}else if(yn.equals("N")){
						System.out.println("C, 친구같이 편안한 연애를 하는 타입");
						yn =s.nextLine();

						}

					}else if(yn.equals("N")){
					System.out.println("B, 자유로운 연애를 하는 타입");
					yn =s.nextLine();

					}

				
			}else if(yn.equals("N")){
			System.out.println("활동적인 데이트가 좋다.");
				
					if(yn.equals("Y")){
					System.out.println("이성친구는 존재할 수 없다.");
					yn =s.nextLine();
					
					
						if(yn.equals("Y")){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						yn =s.nextLine();
						
							if(yn.equals("Y")){
							System.out.println("D, 다퍼주는 연애를 하는 타입");
							yn =s.nextLine();

								
							}else if(yn.equals("N")){
							System.out.println("C, 친구같이 편안한 연애를 하는 타입");
							yn =s.nextLine();

							}
						
						}else if(yn.equals("N")){
						System.out.println("B, 자유로운 연애를 하는 타입");
						yn =s.nextLine();

						}
					}
			
					
			}else if(yn.equals("N")){
					System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
					yn =s.nextLine();
					
						if(yn.equals("Y")){
						System.out.println("D, 다퍼주는 연애를 하는 타입");
						yn =s.nextLine();

						
						}else if(yn.equals("N")){
						System.out.println("C, 친구같이 편안한 연애를 하는 타입");
						yn =s.nextLine();

						}
			}
			
			
			}else if(yn.equals("Y")){
			System.out.println("활동적인 데이트가 좋다");
			yn =s.nextLine();
			
				if(yn.equals("Y")){
				System.out.println("이성친구는 존재할 수 없다.");
				yn =s.nextLine();
				
					if(yn.equals("Y")){
					System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
					yn =s.nextLine();
					
						if(yn.equals("Y")){
						System.out.println("D, 다퍼주는 연애를 하는 타입");
						yn =s.nextLine();

						
						}else if(yn.equals("N")){
						System.out.println("C, 친구같이 편안한 연애를 하는 타입");
						yn =s.nextLine();

						}
					
					}else if(yn.equals("N")){
					System.out.println("B, 자유로운 연애를 하는 타입");
					yn =s.nextLine();

					}
				
				}else if(yn.equals("N")){
				System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
				yn =s.nextLine();
				
					if(yn.equals("Y")){
					System.out.println("D, 다퍼주는 연애를 하는 타입");
					yn =s.nextLine();

					
					}else if(yn.equals("N")){
					System.out.println("C, 친구같이 편안한 연애를 하는 타입");
					yn =s.nextLine();

					}
				}
			}
			
		
				
			

				
		}else if(yn.equals("Y")){
					System.out.println("이성친구는 존재할 수 없다.");
					yn =s.nextLine();
					
				}else if(yn.equals("N")){
					System.out.println("활동적인 데이트가 좋다.");
					
					}if(yn.equals("Y")){
						System.out.println("이성친구는 존재할 수 없다.");
						yn =s.nextLine();
						
					}else if(yn.equals("N")){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						
						if(yn.equals("Y")){
							System.out.println("D, 다퍼주는 연애를 하는 타입");
							yn =s.nextLine();
							
						}else if(yn.equals("N")){
							System.out.println("C, 친구같이 편안한 연애를 하는 타입");
							yn =s.nextLine();

						}
					}
					
				
				
			
	
				
					
			
			
		}else if(yn.equals("N")){
			System.out.println("감정기복이 크지 않다.");
			
			if(yn.equals("Y")){
				System.out.println("연락이 없어도 믿고 기다리는 편이다.");
				yn =s.nextLine();
				
				if(yn.equals("Y")){
					System.out.println("A, 어른스러운 연애를 하는 타입");
					yn =s.nextLine();

				}
				
			}else if(yn.equals("N")){
				System.out.println("이성친구는 존재할 수 없다.");
				yn =s.nextLine();
				
				if(yn.equals("Y")){
				System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
				yn =s.nextLine();
				
				}else if(yn.equals("N")){
				System.out.println("B, 자유로운 연애를 하는 타입");
				yn =s.nextLine();

				}
			}
		
		}else if(yn.equals("N")){
			System.out.println("감정표현에 솔직한 편이다.");
			
			if(yn.equals("Y")){
			System.out.println("이성친구는 존재할 수 없다.");
			yn =s.nextLine();
			
				if(yn.equals("Y")){
				System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
				yn =s.nextLine();
				
					if(yn.equals("Y")){
					System.out.println("D, 다퍼주는 연애를 하는 타입");
					yn =s.nextLine();

					
					}else if(yn.equals("N")){
					System.out.println("C, 친구같이 편안한 연애를 하는 타입");
					}
				
				}else if(yn.equals("N")){
					System.out.println("B, 자유로운 연애를 하는 타입");
					yn =s.nextLine();

				}
			
			
			}else if(yn.equals("N")){
				System.out.println("활동적인 데이트가 좋다.");
				yn =s.nextLine();
				
				if(yn.equals("Y")){
					System.out.println("이성친구는 존재할 수 없다.");
					yn =s.nextLine();
					
				
					
					 if(yn.equals("Y")){
					 System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
					 yn =s.nextLine();
					 
					 	if(yn.equals("Y")){
						System.out.println("D, 다퍼주는 연애를 하는 타입");
						yn =s.nextLine();

									
						}else if(yn.equals("N")){
						System.out.println("C, 친구같이 편안한 연애를 하는 타입");
						yn =s.nextLine();

						}
					 
					 }else if(yn.equals("N")){
					 System.out.println("B, 자유로운 연애를 하는 타입");
						yn =s.nextLine();

					 }
				}
				 
					 							
					
				}if(yn.equals("N")){
					System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
					yn =s.nextLine();
					
					if(yn.equals("Y")){
					System.out.println("D, 다퍼주는 연애를 하는 타입");
					yn =s.nextLine();

					
						
					}else if(yn.equals("N")){
					System.out.println("C, 친구같이 편안한 연애를 하는 타입");
					yn =s.nextLine();

					}
				}
		}
	}
		
				
				
				
		
			
			
}
