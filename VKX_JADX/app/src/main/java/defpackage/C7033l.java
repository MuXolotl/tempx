package defpackage;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؚؕۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7033l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f14740l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f14741l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14742l = 0;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f14743l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f14744l;

    public /* synthetic */ C7033l(C8050l c8050l, int i, C0869l c0869l, int i2, boolean z) {
        this.f14744l = c8050l;
        this.f14741l = i;
        this.f14743l = c0869l;
        this.f14740l = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f14742l) {
            case 0:
                C8050l c8050l = (C8050l) this.f14744l;
                int i = this.f14741l;
                C0869l c0869l = (C0869l) this.f14743l;
                int i2 = this.f14740l;
                try {
                    c8050l.f16774l.getClass();
                    c0869l.skip(i2);
                    c8050l.f16777l.isVip(i, 9);
                    synchronized (c8050l) {
                        c8050l.f16766l.remove(Integer.valueOf(i));
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (IOException unused) {
                }
                return Unit.INSTANCE;
            default:
                C15699l c15699l = (C15699l) this.f14744l;
                String str = (String) this.f14743l;
                int i3 = this.f14741l;
                return "Expected " + c15699l.yandex + " but got " + str.subSequence(i3, this.f14740l + i3 + 1).toString();
        }
    }

    public /* synthetic */ C7033l(C15699l c15699l, String str, int i, int i2) {
        this.f14744l = c15699l;
        this.f14743l = str;
        this.f14741l = i;
        this.f14740l = i2;
    }
}
