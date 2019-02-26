print "Enter verb: \n";
$verb = <STDIN>;
chomp $verb;
if ($verb eq "watch") {
    print $verb . 'es';
}
else {
    $verb = $verb . 's';
    print $verb;
}