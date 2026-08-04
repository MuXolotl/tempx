package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُٖۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11329l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f22829l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f22830l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public AbstractC10022l f22831l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public /* synthetic */ Object f22832l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f22833l;

    /* JADX WARN: Code duplicated, block: B:44:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x00da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fc  */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        boolean zBooleanValue;
        int i;
        AbstractC10022l abstractC10022l;
        AbstractC10022l abstractC10022l2;
        String str;
        Throwable c17072l;
        AbstractC10022l abstractC10022l3 = (AbstractC10022l) this.f22832l;
        int i2 = this.f22830l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(obj);
                zBooleanValue = ((Boolean) abstractC10022l3.loadAd().getAttributes().crashlytics(AbstractC8486l.crashlytics)).booleanValue();
                if (!zBooleanValue) {
                    InterfaceC6272l interfaceC6272l = AbstractC16881l.loadAd;
                    StringBuilder sb = new StringBuilder("Skipping default response validation for ");
                    InterfaceC1814l interfaceC1814l = abstractC10022l3.loadAd().f27846l;
                    sb.append((interfaceC1814l != null ? interfaceC1814l : null).getUrl());
                    interfaceC6272l.vip(sb.toString());
                    return Unit.INSTANCE;
                }
                int i3 = abstractC10022l3.mopub().f5987l;
                C14249l c14249lLoadAd = abstractC10022l3.loadAd();
                if (i3 < 300 || c14249lLoadAd.getAttributes().loadAd(AbstractC16881l.yandex)) {
                    return Unit.INSTANCE;
                }
                this.f22832l = abstractC10022l3;
                this.f22833l = zBooleanValue;
                this.f22829l = i3;
                this.f22830l = 1;
                Object objAmazon = AbstractC13841l.amazon(c14249lLoadAd, this);
                if (objAmazon != enumC9342l) {
                    i = i3;
                    obj = objAmazon;
                }
                return enumC9342l;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.f22829l;
                abstractC10022l2 = this.f22831l;
                try {
                    AbstractC2829l.crashlytics(obj);
                    str = (String) obj;
                } catch (C8331l unused) {
                    str = "<body failed decoding>";
                }
                if (300 > i && i < 400) {
                    c17072l = new C8089l(abstractC10022l2, str, 1);
                } else if (400 > i && i < 500) {
                    c17072l = new C8089l(abstractC10022l2, str, 0);
                } else if (500 <= i || i >= 600) {
                    c17072l = new C17072l(abstractC10022l2, str);
                } else {
                    c17072l = new C8089l(abstractC10022l2, str, 2);
                }
                InterfaceC6272l interfaceC6272l2 = AbstractC16881l.loadAd;
                StringBuilder sb2 = new StringBuilder("Default response validation for ");
                InterfaceC1814l interfaceC1814l2 = abstractC10022l3.loadAd().f27846l;
                sb2.append((interfaceC1814l2 != null ? interfaceC1814l2 : null).getUrl());
                sb2.append(" failed with ");
                sb2.append(c17072l);
                interfaceC6272l2.vip(sb2.toString());
                throw c17072l;
            }
            i = this.f22829l;
            zBooleanValue = this.f22833l;
            AbstractC2829l.crashlytics(obj);
            this.f22832l = abstractC10022l3;
            this.f22831l = abstractC10022l;
            this.f22833l = zBooleanValue;
            this.f22829l = i;
            this.f22830l = 2;
            Object objLoadAd = AbstractC3474l.loadAd(abstractC10022l, AbstractC9050l.yandex, this);
            if (objLoadAd != enumC9342l) {
                AbstractC10022l abstractC10022l4 = abstractC10022l;
                obj = objLoadAd;
                abstractC10022l2 = abstractC10022l4;
                str = (String) obj;
                if (300 > i) {
                    if (400 > i) {
                        if (500 <= i) {
                            c17072l = new C17072l(abstractC10022l2, str);
                        } else {
                            c17072l = new C17072l(abstractC10022l2, str);
                        }
                    } else if (500 <= i) {
                        c17072l = new C17072l(abstractC10022l2, str);
                    } else {
                        c17072l = new C17072l(abstractC10022l2, str);
                    }
                } else if (400 > i) {
                    if (500 <= i) {
                        c17072l = new C17072l(abstractC10022l2, str);
                    } else {
                        c17072l = new C17072l(abstractC10022l2, str);
                    }
                } else if (500 <= i) {
                    c17072l = new C17072l(abstractC10022l2, str);
                } else {
                    c17072l = new C17072l(abstractC10022l2, str);
                }
                InterfaceC6272l interfaceC6272l3 = AbstractC16881l.loadAd;
                StringBuilder sb3 = new StringBuilder("Default response validation for ");
                InterfaceC1814l interfaceC1814l3 = abstractC10022l3.loadAd().f27846l;
                sb3.append((interfaceC1814l3 != null ? interfaceC1814l3 : null).getUrl());
                sb3.append(" failed with ");
                sb3.append(c17072l);
                interfaceC6272l3.vip(sb3.toString());
                throw c17072l;
            }
            return enumC9342l;
        } catch (C8331l unused2) {
            abstractC10022l2 = abstractC10022l;
            str = "<body failed decoding>";
        }
        C14249l c14249l = (C14249l) obj;
        c14249l.getAttributes().mopub(AbstractC16881l.yandex, Unit.INSTANCE);
        abstractC10022l = c14249l.f27845l;
        if (abstractC10022l == null) {
            abstractC10022l = null;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C11329l c11329l = new C11329l(2, interfaceC14029l);
        c11329l.f22832l = obj;
        return c11329l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C11329l) ads((InterfaceC14029l) obj2, (AbstractC10022l) obj)).Signature(Unit.INSTANCE);
    }
}
