package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lِؔٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2710l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ long f5861l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ float f5862l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f5863l;

    public /* synthetic */ C2710l(float f, int i, long j) {
        this.f5863l = i;
        this.f5862l = f;
        this.f5861l = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f5863l;
        float f = this.f5862l;
        switch (i) {
            case 0:
                InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj;
                float fMo868instanceof = interfaceC13349l.mo868instanceof(f);
                interfaceC13349l.mo2074volatile(this.f5861l, (((long) Float.floatToRawIntBits(interfaceC13349l.mo868instanceof(f) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(interfaceC13349l.mo868instanceof(f) / 2.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L))))), fMo868instanceof, (496 & 16) != 0 ? 0 : 0);
                break;
            default:
                InterfaceC13349l interfaceC13349l2 = (InterfaceC13349l) obj;
                float fMo868instanceof2 = interfaceC13349l2.mo868instanceof(f);
                interfaceC13349l2.mo2074volatile(this.f5861l, (((long) Float.floatToRawIntBits(interfaceC13349l2.mo868instanceof(f) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC13349l2.admob() >> 32)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(interfaceC13349l2.mo868instanceof(f) / 2.0f))), fMo868instanceof2, (496 & 16) != 0 ? 0 : 0);
                break;
        }
        return Unit.INSTANCE;
    }
}
