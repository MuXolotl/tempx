package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؙٝؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6599l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C5124l f13817l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13818l;

    public /* synthetic */ C6599l(C5124l c5124l, int i) {
        this.f13818l = i;
        this.f13817l = c5124l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f13818l;
        C5124l c5124l = this.f13817l;
        switch (i) {
            case 0:
                c5124l.m4125private(new C12842l());
                break;
            case 1:
                c5124l.f11157l.setValue(Boolean.FALSE);
                break;
            case 2:
                c5124l.m4125private(new C0113l());
                break;
            case 3:
                c5124l.f11157l.setValue(Boolean.TRUE);
                break;
            case 4:
                c5124l.m4125private(new C6473l());
                break;
            default:
                InterfaceC17817l interfaceC17817lM2932import = c5124l.m2932import();
                C3086l c3086l = interfaceC17817lM2932import instanceof C3086l ? (C3086l) interfaceC17817lM2932import : null;
                Map map = c3086l != null ? c3086l.crashlytics : null;
                if (map == null) {
                    map = C14054l.f27396l;
                }
                new C17517l("common", map).Signature(c5124l.isVip());
                break;
        }
        return Unit.INSTANCE;
    }
}
