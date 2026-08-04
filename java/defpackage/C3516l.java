package defpackage;

import java.io.File;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؙٜؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3516l extends AbstractC16335l {
    public int amazon;
    public final /* synthetic */ C0149l billing;
    public File[] crashlytics;
    public boolean loadAd;
    public boolean purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3516l(C0149l c0149l, File file) {
        super(file);
        this.billing = c0149l;
    }

    @Override // defpackage.AbstractC17188l
    public final File yandex() {
        int i;
        boolean z = this.purchase;
        File file = this.yandex;
        if (!z && this.crashlytics == null) {
            File[] fileArrListFiles = file.listFiles();
            this.crashlytics = fileArrListFiles;
            if (fileArrListFiles == null) {
                Function2 function2 = this.billing.f1056l.crashlytics;
                if (function2 != null) {
                    function2.invoke(file, new C7802l(file, 0));
                }
                this.purchase = true;
            }
        }
        File[] fileArr = this.crashlytics;
        if (fileArr != null && (i = this.amazon) < fileArr.length) {
            this.amazon = i + 1;
            return fileArr[i];
        }
        if (this.loadAd) {
            return null;
        }
        this.loadAd = true;
        return file;
    }
}
