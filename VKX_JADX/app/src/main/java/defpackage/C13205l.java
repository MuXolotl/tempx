package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؚْٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13205l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f25970l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ float f25971l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25972l = 0;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f25973l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f25974l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f25975l;

    public /* synthetic */ C13205l(C8896l c8896l, C13616l c13616l, AbstractC9544l abstractC9544l, float f, C9902l c9902l) {
        this.f25970l = c8896l;
        this.f25974l = c13616l;
        this.f25973l = abstractC9544l;
        this.f25971l = f;
        this.f25975l = c9902l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f25972l;
        Object obj2 = this.f25975l;
        Object obj3 = this.f25973l;
        Object obj4 = this.f25974l;
        Object obj5 = this.f25970l;
        switch (i) {
            case 0:
                C8896l c8896l = (C8896l) obj5;
                C13616l c13616l = (C13616l) obj4;
                AbstractC9544l abstractC9544l = (AbstractC9544l) obj3;
                float f = this.f25971l;
                C9902l c9902l = (C9902l) obj2;
                InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj;
                float f2 = -c8896l.yandex;
                float f3 = -c8896l.loadAd;
                ((C16543l) interfaceC13349l.mo2065break().f36010l).inmobi(f2, f3);
                try {
                    AbstractC9361l.smaato(interfaceC13349l, c13616l.amazon, abstractC9544l, 0.0f, new C0404l(f * 2.0f, 0.0f, 0, 0, null, 30), null, 52);
                    float fIntBitsToFloat = (Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32));
                    float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L));
                    long jMo2070l = interfaceC13349l.mo2070l();
                    C18449l c18449lMo2065break = interfaceC13349l.mo2065break();
                    long jM4551private = c18449lMo2065break.m4551private();
                    c18449lMo2065break.m4555synchronized().mopub();
                    try {
                        ((C16543l) c18449lMo2065break.f36010l).isVip(fIntBitsToFloat, fIntBitsToFloat2, jMo2070l);
                        AbstractC9361l.smaato(interfaceC13349l, c9902l, abstractC9544l, 0.0f, null, null, 28);
                        c18449lMo2065break.m4555synchronized().ads();
                        c18449lMo2065break.m4534abstract(jM4551private);
                        ((C16543l) interfaceC13349l.mo2065break().f36010l).inmobi(-f2, -f3);
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        c18449lMo2065break.m4555synchronized().ads();
                        c18449lMo2065break.m4534abstract(jM4551private);
                        throw th;
                    }
                } catch (Throwable th2) {
                    ((C16543l) interfaceC13349l.mo2065break().f36010l).inmobi(-f2, -f3);
                    throw th2;
                }
            default:
                long jLongValue = ((Long) obj).longValue();
                AbstractC18719l.admob((C14734l) ((C10700l) obj5).f21708l, jLongValue, this.f25971l, (InterfaceC14748l) obj4, (C6570l) obj3, (Function1) obj2);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C13205l(C10700l c10700l, float f, InterfaceC14748l interfaceC14748l, C6570l c6570l, Function1 function1) {
        this.f25970l = c10700l;
        this.f25971l = f;
        this.f25974l = interfaceC14748l;
        this.f25973l = c6570l;
        this.f25975l = function1;
    }
}
