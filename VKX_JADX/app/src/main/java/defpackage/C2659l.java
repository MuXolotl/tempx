package defpackage;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٖؔۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2659l extends AbstractC0085l {
    public final boolean amazon;
    public final C8688l billing;
    public final int crashlytics;
    public final String[] loadAd;
    public final int mopub;
    public final C8688l purchase;

    public C2659l() {
        String[] strArrYandex;
        try {
            strArrYandex = AbstractC2890l.yandex();
        } catch (Exception e) {
            if (!(e instanceof IOException)) {
                e.printStackTrace();
            }
            strArrYandex = null;
        }
        this.loadAd = strArrYandex;
        this.crashlytics = R.string.storage_external;
        final int i = 0;
        final int i2 = 1;
        this.amazon = !(strArrYandex == null || strArrYandex.length == 0);
        this.purchase = new C8688l(new Function0(this) { // from class: lٚۛ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C2659l f35960l;

            {
                this.f35960l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                C2659l c2659l = this.f35960l;
                switch (i3) {
                    case 0:
                        File file = new File(c2659l.loadAd[0], "cache_v2");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        return file;
                    default:
                        File file2 = new File(c2659l.loadAd[0], "cdcm_temp");
                        if (!file2.exists()) {
                            file2.mkdirs();
                        }
                        return file2;
                }
            }
        });
        this.billing = new C8688l(new Function0(this) { // from class: lٚۛ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C2659l f35960l;

            {
                this.f35960l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                C2659l c2659l = this.f35960l;
                switch (i3) {
                    case 0:
                        File file = new File(c2659l.loadAd[0], "cache_v2");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        return file;
                    default:
                        File file2 = new File(c2659l.loadAd[0], "cdcm_temp");
                        if (!file2.exists()) {
                            file2.mkdirs();
                        }
                        return file2;
                }
            }
        });
        this.mopub = 1;
    }

    @Override // defpackage.AbstractC0085l
    public final int amazon() {
        return this.crashlytics;
    }

    @Override // defpackage.AbstractC0085l
    public final File crashlytics() {
        return (File) this.billing.getValue();
    }

    @Override // defpackage.AbstractC0085l
    public final File loadAd() {
        return (File) this.purchase.getValue();
    }

    @Override // defpackage.AbstractC0085l
    public final int yandex() {
        return this.mopub;
    }
}
