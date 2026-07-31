package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؘٟٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5865l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C11655l f12357l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f12358l;

    public /* synthetic */ C5865l(C11655l c11655l, int i) {
        this.f12358l = i;
        this.f12357l = c11655l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f12358l;
        C11655l c11655l = this.f12357l;
        switch (i) {
            case 0:
                c11655l.f23369l.setValue(Boolean.FALSE);
                break;
            case 1:
                c11655l.f23369l.setValue(Boolean.FALSE);
                break;
            default:
                c11655l.f23369l.setValue(Boolean.FALSE);
                AppActivity appActivity = (AppActivity) c11655l.isVip();
                AbstractC9033l.loadAd(AbstractC11990l.firebase(appActivity), appActivity, true, new C8912l(c11655l, null, 24));
                break;
        }
        return Unit.INSTANCE;
    }
}
