package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَؙۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10140l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12244l f20641l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ float f20642l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ long f20643l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12244l f20644l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f20645l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12244l f20646l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12244l f20647l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ C0404l f20648l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ float f20649l;

    public /* synthetic */ C10140l(C8456l c8456l, C8456l c8456l2, C8456l c8456l3, C8456l c8456l4, float f, float f2, long j, C0404l c0404l, int i) {
        this.f20645l = i;
        this.f20644l = c8456l;
        this.f20641l = c8456l2;
        this.f20647l = c8456l3;
        this.f20646l = c8456l4;
        this.f20649l = f;
        this.f20642l = f2;
        this.f20643l = j;
        this.f20648l = c0404l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f20645l;
        float f = this.f20642l;
        float f2 = this.f20649l;
        InterfaceC12244l interfaceC12244l = this.f20646l;
        InterfaceC12244l interfaceC12244l2 = this.f20647l;
        InterfaceC12244l interfaceC12244l3 = this.f20641l;
        InterfaceC12244l interfaceC12244l4 = this.f20644l;
        switch (i) {
            case 0:
                InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj;
                float fFloatValue = (((Number) interfaceC12244l4.getValue()).floatValue() * 216.0f) % 360.0f;
                float fAbs = Math.abs(((Number) interfaceC12244l3.getValue()).floatValue() - ((Number) interfaceC12244l2.getValue()).floatValue());
                float fFloatValue2 = (((f2 / (f / 2.0f)) * 57.29578f) / 2.0f) + ((Number) interfaceC12244l2.getValue()).floatValue() + ((Number) interfaceC12244l.getValue()).floatValue() + (fFloatValue - 90.0f);
                float fMax = Math.max(fAbs, 0.1f);
                C0404l c0404l = this.f20648l;
                float f3 = c0404l.yandex / 2.0f;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32)) - (2.0f * f3);
                interfaceC13349l.applovin(this.f20643l, fFloatValue2, fMax, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (768 & 64) != 0 ? 1.0f : 0.0f, c0404l);
                break;
            default:
                InterfaceC13349l interfaceC13349l2 = (InterfaceC13349l) obj;
                float fFloatValue3 = (((Number) interfaceC12244l4.getValue()).floatValue() * 216.0f) % 360.0f;
                float fAbs2 = Math.abs(((Number) interfaceC12244l3.getValue()).floatValue() - ((Number) interfaceC12244l2.getValue()).floatValue());
                float fFloatValue4 = (((f2 / (f / 2.0f)) * 57.29578f) / 2.0f) + ((Number) interfaceC12244l2.getValue()).floatValue() + ((Number) interfaceC12244l.getValue()).floatValue() + (fFloatValue3 - 90.0f);
                float fMax2 = Math.max(fAbs2, 0.1f);
                C0404l c0404l2 = this.f20648l;
                float f4 = c0404l2.yandex / 2.0f;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC13349l2.admob() >> 32)) - (2.0f * f4);
                interfaceC13349l2.applovin(this.f20643l, fFloatValue4, fMax2, (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), (768 & 64) != 0 ? 1.0f : 0.0f, c0404l2);
                break;
        }
        return Unit.INSTANCE;
    }
}
