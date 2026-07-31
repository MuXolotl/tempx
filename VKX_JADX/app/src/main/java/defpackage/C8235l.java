package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lًۙۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8235l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AppActivity f17124l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17125l;

    public /* synthetic */ C8235l(AppActivity appActivity, int i) {
        this.f17125l = i;
        this.f17124l = appActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f17125l;
        AppActivity appActivity = this.f17124l;
        switch (i) {
            case 0:
                int i2 = AppActivity.f36635l;
                return new C6124l(appActivity.getWindow(), appActivity.getWindow().getDecorView());
            case 1:
                AbstractC10999l.mopub(AbstractC11990l.firebase(appActivity), null, 0, new C12230l(appActivity, null, 1), 3);
                return Unit.INSTANCE;
            default:
                AbstractC10999l.mopub(AbstractC11990l.firebase(appActivity), null, 0, new C12230l(appActivity, null, 2), 3);
                return Unit.INSTANCE;
        }
    }
}
