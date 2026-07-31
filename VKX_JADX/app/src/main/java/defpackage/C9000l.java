package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٌٖۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9000l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C10507l f18555l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f18556l;

    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        C10507l c10507l;
        boolean z;
        AbstractC18643l abstractC18643l;
        AbstractC18643l abstractC18643l2;
        AbstractC18643l abstractC18643l3;
        int i = this.f18556l;
        String strBilling = null;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            C16076l c16076l = VKXApplication.f36632l;
            if (c16076l == null) {
                c16076l = null;
            }
            C10507l c10507lCrashlytics = c16076l.crashlytics();
            C1424l c1424l = VKXApplication.f36627l;
            if (c1424l == null) {
                c1424l = null;
            }
            InterfaceC6942l interfaceC6942lYandex = ((InterfaceC15829l) c1424l.f3603l).yandex();
            this.f18555l = c10507lCrashlytics;
            this.f18556l = 1;
            Object objFirebase = AbstractC0622l.firebase(interfaceC6942lYandex, this);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objFirebase == enumC9342l) {
                return enumC9342l;
            }
            obj = objFirebase;
            c10507l = c10507lCrashlytics;
        } else {
            if (i != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c10507l = this.f18555l;
            AbstractC2829l.crashlytics(obj);
        }
        C7814l c7814l = (C7814l) obj;
        if (c10507l == null) {
            z = false;
        } else {
            C16076l c16076l2 = VKXApplication.f36632l;
            if (c16076l2 == null) {
                c16076l2 = null;
            }
            if (c16076l2.mopub()) {
                z = false;
            } else {
                z = true;
            }
        }
        C16076l c16076l3 = VKXApplication.f36632l;
        if (c16076l3 == null) {
            c16076l3 = null;
        }
        boolean z2 = c16076l3.purchase() == EnumC11447l.f23031l;
        String loadAd = (c10507l == null || (abstractC18643l3 = c10507l.loadAd) == null) ? null : abstractC18643l3.getLoadAd();
        String str = loadAd == null ? "" : loadAd;
        String crashlytics = (c10507l == null || (abstractC18643l2 = c10507l.loadAd) == null) ? null : abstractC18643l2.getCrashlytics();
        String str2 = crashlytics == null ? "" : crashlytics;
        if (c10507l != null && (abstractC18643l = c10507l.loadAd) != null) {
            strBilling = C1602l.billing(abstractC18643l);
        }
        return new C3259l(z, z2, str, str2, strBilling == null ? "" : strBilling, c7814l.f16334l, C3844l.f7950l);
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C9000l(2, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C9000l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
