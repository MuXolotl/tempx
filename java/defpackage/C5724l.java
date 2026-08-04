package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘٖٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5724l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f12105l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ float f12106l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f12107l;

    public /* synthetic */ C5724l(float f, Object obj, int i) {
        this.f12107l = i;
        this.f12106l = f;
        this.f12105l = obj;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009f  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.f12107l;
        boolean z2 = false;
        float f = this.f12106l;
        Object obj2 = this.f12105l;
        switch (i) {
            case 0:
                C6148l c6148l = (C6148l) obj;
                float fAdmob = ((C13765l) ((C8954l) obj2).mopub.subs).admob();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & c6148l.f12958l));
                if (!Float.isNaN(fAdmob) && !Float.isNaN(fIntBitsToFloat) && fIntBitsToFloat != 0.0f) {
                    c6148l.remoteconfig(AbstractC10208l.crashlytics(c6148l, f));
                    c6148l.vip(AbstractC10208l.amazon(c6148l, f));
                    c6148l.tapsense(AbstractC5518l.yandex(0.5f, (fAdmob + fIntBitsToFloat) / fIntBitsToFloat));
                }
                return Unit.INSTANCE;
            case 1:
                C9122l c9122l = (C9122l) obj2;
                InterfaceC5960l interfaceC5960l = (InterfaceC5960l) obj;
                boolean zYandex = AbstractC8576l.yandex(interfaceC5960l.mo531interface(), "waiting");
                if (interfaceC5960l.mo1916goto() == null) {
                    z = false;
                } else {
                    EnumC7283l enumC7283lMo1916goto = interfaceC5960l.mo1916goto();
                    C12349l c12349l = AbstractC16318l.yandex;
                    if (enumC7283lMo1916goto != EnumC7283l.f15125l ? f <= 30.0f || f > 90.0f : f > 30.0f) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                if (c9122l.f18750l || (zYandex && z)) {
                    z2 = true;
                }
                c9122l.f18750l = z2;
                return Boolean.valueOf(!z2);
            case 2:
                C6148l c6148l2 = (C6148l) obj;
                c6148l2.crashlytics(f);
                c6148l2.startapp((InterfaceC6347l) obj2);
                c6148l2.purchase(true);
                return Unit.INSTANCE;
            case 3:
                InterfaceC13490l interfaceC13490l = (InterfaceC13490l) obj;
                return new C5177l((((long) interfaceC13490l.mo870l(f)) & 4294967295L) | (((long) interfaceC13490l.mo870l(((C14467l) ((InterfaceC12244l) obj2).getValue()).f28331l)) << 32));
            default:
                C18656l c18656l = (C18656l) obj2;
                long jLongValue = ((Long) obj).longValue();
                boolean zMopub = c18656l.mopub();
                C10703l c10703l = c18656l.admob;
                if (!zMopub) {
                    if (c10703l.admob() == Long.MIN_VALUE) {
                        c10703l.subs(jLongValue);
                        c18656l.yandex.yandex.setValue(Boolean.TRUE);
                    }
                    long jAdmob = jLongValue - c10703l.admob();
                    if (f != 0.0f) {
                        jAdmob = AbstractC5573l.subscription(jAdmob / ((double) f));
                    }
                    if (c18656l.loadAd == null) {
                        c18656l.mopub.subs(jAdmob);
                    }
                    c18656l.admob(jAdmob, f == 0.0f);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C5724l(Object obj, float f, int i) {
        this.f12107l = i;
        this.f12105l = obj;
        this.f12106l = f;
    }
}
