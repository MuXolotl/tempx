package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.catalogkit.objects.Catalog2Response;
import ua.itaysonlab.catalogkit.objects.Catalog2Section;
import ua.itaysonlab.catalogkit.objects.Catalog2Text;

/* JADX INFO: renamed from: lٓۖ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14336l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f28085l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C6069l f28086l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14336l(C6069l c6069l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f28086l = c6069l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        Object objBilling;
        int i = this.f28085l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            this.f28085l = 1;
            C6336l c6336l = C6336l.yandex;
            objBilling = C6336l.billing(new C8578l(6), this);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objBilling == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
            objBilling = obj;
        }
        List list = (List) objBilling;
        C12249l c12249l = new C12249l(this.f28086l, list);
        String strTapsense = AbstractC16778l.tapsense();
        ArrayList arrayList = new ArrayList();
        c12249l.invoke(arrayList);
        Unit unit = Unit.INSTANCE;
        return new Catalog2Response(null, new Catalog2Section(strTapsense, "Все треки", null, arrayList, null, 20), null, null, null, null, null, null, null, list, null, null, null, null, null, Collections.singletonList(new Catalog2Text("forDumb", 0, "Данный раздел является хаотичным списком треков, которые существуют в базе данных, чей порядок технически невозможен.\n\nБиблиотека в правильном порядке находится в разделе выше, который появится только после успешного завершения кеширования библиотеки.\n\nУчтите, что любые вопросы по поводу порядка в данном разделе будут игнорироваться.")), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073708541);
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C14336l(this.f28086l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C14336l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
