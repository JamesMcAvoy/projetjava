-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mer 21 Juin 2017 à 15:42
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Base de données :  `boulderdash`
--

DELIMITER $$
--
-- Procédures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `selectlevel`(IN `p_id_level` INT(10))
    NO SQL
SELECT stringlevel
FROM levels
WHERE ID_level = p_id_level$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Structure de la table `levels`
--

CREATE TABLE IF NOT EXISTS `levels` (
  `ID_level` int(10) NOT NULL AUTO_INCREMENT,
  `stringlevel` varchar(1024) NOT NULL,
  PRIMARY KEY (`ID_level`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Contenu de la table `levels`
--

INSERT INTO `levels` (`ID_level`, `stringlevel`) VALUES
(1, '++++++++++++++++++++++++++++++++++++o-------oo-----.-----------------++---x---.-o------+-------o--------++----------.--o-----.xxxx=xxxxxxxx++.+++++++++++++----------o--o-----++o----------+------.-----x--------++o----------+---x---------=-------++--.--.-----+------.--------------++--------o--+----o----o---.-------++----x------+--------------+------++-----.-----+-o-------o-+--x------++-----------+----------+---xxxx---++-----------+--o------+----xxxxxxx++--.---o-o--+-------o+----.=xxx=xx++--x--------+-------+-------------++---.-------+------+--------------++----xxx----+-++---+-------o------++---xxxx----+------o------++-+++--++--o-x-=----+----+-+------+--+.---++o------------------------+--+++--++---o------------o-------.+-------++o----.---o-----------o---+--+----++++++++++++++++++++++++++++++++++++'),
(2, '++++++++++++++++++++++++++++++++++++--------xx=xx-----xx=xx-----xx=xx++-ooooo---------------------------++-o-.-o--ooooo-----ooooo-----ooooo++-ooooo------o-------.-o-----o----++------------o---------ooxxxxo-.--++----xxxx----o-xxxx----o-xxxxooooo++----xxxx----o-xxxxooooo-=xxx-----++----x=xx----o-xx=xo---o----------++------------ooooooo--------------++--------------.----------oooooooo++-------------------------o----.--++--xxxxxxxxxx-------------o-------++--xxx=xxxxxx--x-----o----oxxxxxxx++oooooooooooo-xxx-oooo----oxxx=xxx++------------xx=xx---oxxxx--------++------------o-------ox=xx--------++----ooooooooo-------o---ooooooooo++------------o--------------------++---xxxx-----o-------oooooooxxxxxx++xxxxxxxxxx--o-------------oxxxxxx++x=xxxxx.xxxxo---------.---ox=.xxx++++++++++++++++++++++++++++++++++++'),
(3, '++++++++++++++++++++++++++++++++++++---------------------------------++--xxxxx-------------------xxxxx--++--xxxxx-------------------xxxxx--++--xxxxx-------------------xxxxx--++--xxxxx-------------------xxxxx--++--xx=xx-------------------xx=xx--++--------------ooooo--------------++--xxxxx-------o---o-------xxxxx--++--xxxxx-------oxxxo-------xxxxx--++--xxxxx-------ox.=o-------xxxxx--++--xxxxx-------ooooo-------xxxxx--++--=xxxxxx---------------xxxxx=x--++----xxxxx---------------xxxxx----++----xxxxxxxxxxxxxxxxxxxxxxxxx----++-------xxxxxxxxxxxxxxxxxxx-------++-------xxxxxxxx=xxxxxxxxxx-------++ooooooooooo-----------ooooooooooo++----------o-----------o----------++xxxxxxxxxxo-----------oxxxxxxxxxx++xxxxxxxxxxo-----------oxxxxxxxxxx++.x=xxxxxxx-------------xxxx=xxxx.++++++++++++++++++++++++++++++++++++'),
(4, '++++++++++++++++++++++++++++++++++++-----o----xxxxx----o----xxxxxx--.++----o------oo---xxx-xxxxxxxx=xxxx++------------------o-----o--------++--xxx------o=xxxxxxxxxxx-xxxxxxxx++-x----o----------o--xxxxxxx------++-x----------o-------xxoooxx------++-x----------------xx==o.o==xx----++-xooooooxxx-----------ooo--------++-xo=x.=oxxx---o------------------++-x----.oooxx-------------oo------++-x----------o-------o----o-o-----++-x-----o--o--------------o-------++-x-----oooo-------o--o------o----++-xo-------------------------o----++xx-x-------------o-----o---------++x=xxo-------------xxx-----o------++-------oo---xxxxxxx=x---o.-------++------o-------------oo---xxxxxxx.++----------------------xx--oo-----++oo-xxxo------o-------x=xxx--xxxxx++o-.-=xxxxxx-----------o----------++++++++++++++++++++++++++++++++++++'),
(5, '++++++++++++++++++++++++++++++++++++xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx.++++++++++++++++++++++++++++++++x--++.---ooo------ooo--oo---ooo--o-xxx++=xxx---=xxxxx---xx--xxx---xx-=xxx++--+++++++++++++++++++++++++++++++++-----------------------ooooooooo.++---------------------------------++xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx=+++++++++++++++++++++++++++++++++--++.=xxxxx=xxxxx=xxxxxxxxxxxxxxxxxxx++=xxxxxxxx=xxxxxxxxxxxxxxxxxxxxxxx++=xxxx=xxxxxxxxxxxxxxxxxxxxxxxxxxx++---++++++++++++++++++++++++++++++++-------ooo-----------ooo--------.++-xxxxxx---xxxxxx=xxxx---xxxxxxxx=+++++++++++++++++++++++++++++++++--++.ooooo---ooooo---ooooo---ooooo---++=xxxxxxxxxx----------------------++---++++++++++++++++++++++++++++++++---------xxx=--------xxx=-------.++---xxx=---------xx=-------xxx=---++++++++++++++++++++++++++++++++++++');
