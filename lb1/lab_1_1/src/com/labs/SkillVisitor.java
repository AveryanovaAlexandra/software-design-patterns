package com.labs;

// Составная часть паттерна ВЗИТОР.
// По факту, сейчас визитор не используется. Предполагалось
// использовать его для получения типа ЗУНа и формирования
// строчки для печати, однако получилось обойтись
// переопределением метода `toString()`
public interface SkillVisitor {
    void visit(SkillKnowledge knowledge);
    void visit(SkillAbility ability);
    void visit(SkillExperience experience);
}
