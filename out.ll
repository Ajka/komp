declare i32 @printInt(i32)
declare i32 @iexp(i32, i32)
define i32 @add(i32 %R4,i32 %R6) {
start:
%R5 = alloca i32
store i32 %R4, i32* %R5
%R7 = alloca i32
store i32 %R6, i32* %R7
%R8 = load i32* %R5
%R9 = load i32* %R7
%R10 = add i32 %R8, %R9
%R11 = alloca i32
store i32 %R10, i32* %R11
%R12 = load i32* %R11
ret i32 %R12
}
define i32 @pr(i32 %R18) {
start:
%R19 = alloca i32
store i32 %R18, i32* %R19
%R20 = add i32 0, 1
%R21 = alloca i32
store i32 %R20, i32* %R21
br label %L0
L0:
%R22 = load i32* %R21
%R23 = add i32 0, 10
%R24 = sub i32 %R22, %R23
%R28 = icmp ne i32 %R24, 0
br i1 %R28, label %L1, label %L2
L1:
%R25 = load i32* %R21
%R26 = add i32 0, 1
%R27 = add i32 %R25, %R26
store i32 %R27, i32* %R21
br label %L0
L2:
%R29 = add i32 0, 0
%R30 = load i32* %R19
%R31 = load i32* %R21
%R32 = add i32 %R30, %R31
ret i32 %R32
}
define i32 @main() {
start:
%R0 = add i32 0, 2
%R1 = alloca i32
store i32 %R0, i32* %R1
%R2 = add i32 0, 3
%R3 = alloca i32
store i32 %R2, i32* %R3
%R13 = load i32* %R1
%R14 = load i32* %R3
%R15 = add i32 0, 1
%R16 = add i32 %R14, %R15
%R17 = call i32 @add(i32 %R13,i32 %R16)
call i32 @printInt (i32 %R17)
%R33 = add i32 0, 15
%R34 = alloca i32
store i32 %R33, i32* %R34
%R35 = add i32 0, 0
%R36 = alloca i32
store i32 %R35, i32* %R36
br label %L3
L3:
%R37 = load i32* %R36
%R38 = load i32* %R36
%R39 = mul i32 %R37, %R38
%R40 = add i32 0, 25
%R41 = icmp slt i32 %R39, %R40
br i1 %R41, label %L4, label %L5
L4:
%R46 = load i32* %R36
%R47 = add i32 0, 10
%R48 = sub i32 %R46, %R47
%R49 = alloca i32
store i32 %R48, i32* %R49
%R50 = load i32* %R49
%R51 = call i32 @pr(i32 %R50)
call i32 @printInt (i32 %R51)
%R43 = load i32* %R36
%R44 = add i32 0, 1
%R45 = add i32 %R43, %R44
store i32 %R45, i32* %R36
br label %L3
L5:
%R52 = add i32 0, 0
%R53 = load i32* %R34
%R54 = call i32 @pr(i32 %R53)
call i32 @printInt (i32 %R54)
ret i32 0
}
