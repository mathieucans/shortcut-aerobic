class Koans4Bonus :
    def goToTest(self) :
        # by using ⌘⇧T / Ctrl+Shift+T (on the class name)
        raise Exception('remove me and go back to test')
        return 'go to test'

    def inside(self) :
        # Inline following method with ⌥⌘N / Ctrl+Alt+N
        # and change returned string for inside requirement
        return self.__inlinedMe()

    def outside(self) :
        return self.__inlinedMe()

    def __inlinedMe(self) :
        return 'outside'
