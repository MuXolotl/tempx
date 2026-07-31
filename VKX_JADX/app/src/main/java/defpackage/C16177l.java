package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٖؕۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16177l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ List f31675l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f31676l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f31677l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16177l(int i, InterfaceC14029l interfaceC14029l, List list) {
        super(2, interfaceC14029l);
        this.f31676l = i;
        this.f31675l = list;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        int i = this.f31676l;
        List list = this.f31675l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f31677l;
                if (i2 != 0) {
                    if (i2 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                C6168l c6168l = C6168l.f12992l;
                this.f31677l = 1;
                Serializable serializablePremium = c6168l.premium(list, this);
                return serializablePremium == enumC9342l ? enumC9342l : serializablePremium;
            default:
                int i3 = this.f31677l;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC11356l.admob(((AbstractC0958l) it.next()).crashlytics()));
                }
                C13745l c13745l = new C13745l(new ArrayList(arrayList), false, AbstractC12272l.yandex());
                this.f31677l = 1;
                Object objLoadAd = AbstractC3739l.loadAd(c13745l, this);
                return objLoadAd == enumC9342l ? enumC9342l : objLoadAd;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f31676l;
        List list = this.f31675l;
        switch (i) {
            case 0:
                return new C16177l(0, interfaceC14029l, list);
            default:
                return new C16177l(1, interfaceC14029l, list);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f31676l) {
            case 0:
                break;
        }
        return ((C16177l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
