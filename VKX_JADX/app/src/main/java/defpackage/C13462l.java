package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lْٙٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13462l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C15068l f26399l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f26400l;

    public /* synthetic */ C13462l(C15068l c15068l, int i) {
        this.f26400l = i;
        this.f26399l = c15068l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f26400l;
        C15068l c15068l = this.f26399l;
        switch (i) {
            case 0:
                c15068l.f29597l.setValue(Boolean.FALSE);
                break;
            case 1:
                c15068l.f29597l.setValue(Boolean.FALSE);
                break;
            case 2:
                c15068l.f29597l.setValue(Boolean.FALSE);
                AppActivity appActivity = (AppActivity) c15068l.isVip();
                AbstractC9033l.loadAd(AbstractC11990l.firebase(appActivity), appActivity, true, new C11039l(c15068l, null, 10));
                break;
            case 3:
                c15068l.f29600l.setValue(Boolean.TRUE);
                break;
            default:
                c15068l.f29600l.setValue(Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }
}
