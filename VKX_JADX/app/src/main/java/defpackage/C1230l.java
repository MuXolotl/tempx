package defpackage;

import java.io.File;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٟؒؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1230l extends AbstractC16335l {
    public int amazon;
    public File[] crashlytics;
    public boolean loadAd;
    public final /* synthetic */ C0149l purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1230l(C0149l c0149l, File file) {
        super(file);
        this.purchase = c0149l;
    }

    @Override // defpackage.AbstractC17188l
    public final File yandex() {
        Function2 function2;
        boolean z = this.loadAd;
        File file = this.yandex;
        if (!z) {
            this.loadAd = true;
            return file;
        }
        File[] fileArr = this.crashlytics;
        if (fileArr != null && this.amazon >= fileArr.length) {
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = file.listFiles();
            this.crashlytics = fileArrListFiles;
            if (fileArrListFiles == null && (function2 = this.purchase.f1056l.crashlytics) != null) {
                function2.invoke(file, new C7802l(file, 0));
            }
            File[] fileArr2 = this.crashlytics;
            if (fileArr2 == null || fileArr2.length == 0) {
                return null;
            }
        }
        File[] fileArr3 = this.crashlytics;
        int i = this.amazon;
        this.amazon = i + 1;
        return fileArr3[i];
    }
}
