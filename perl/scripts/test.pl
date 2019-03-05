%signs = ("Frank" => "Capricorn", "Amanda" => "Scorpio");
foreach $person (sort keys %signs){
    print "$person: $signs{$person}\n";
}