package defpackage;

import android.text.TextUtils;
import j$.util.Objects;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍؕؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3185l {
    public int crashlytics;
    public final String loadAd;
    public final /* synthetic */ int yandex;

    public C3185l(String str, int i, char c) {
        this.yandex = i;
        switch (i) {
            case 4:
                this.loadAd = str;
                break;
            default:
                AbstractC5641l.yandex(!TextUtils.isEmpty(str));
                this.loadAd = str;
                this.crashlytics = 1;
                break;
        }
    }

    public boolean crashlytics(Function1 function1) {
        int i = this.crashlytics;
        String str = this.loadAd;
        return i < str.length() && ((Boolean) function1.invoke(Character.valueOf(str.charAt(this.crashlytics)))).booleanValue();
    }

    public void loadAd(Function1 function1) {
        if (crashlytics(function1)) {
            while (crashlytics(function1)) {
                this.crashlytics++;
            }
        }
    }

    public String toString() {
        switch (this.yandex) {
            case 1:
                return this.loadAd + ", uid: " + this.crashlytics;
            default:
                return super.toString();
        }
    }

    public boolean yandex(Function1 function1) {
        boolean zCrashlytics = crashlytics(function1);
        if (zCrashlytics) {
            this.crashlytics++;
        }
        return zCrashlytics;
    }

    public C3185l(String str, boolean z, int i) {
        this.yandex = 0;
        this.loadAd = z ? AbstractC14814l.smaato(')', "(", str) : str;
        this.crashlytics = z ? i + 1 : i;
    }

    public C3185l(int i, String str) {
        this.yandex = 2;
        this.crashlytics = i;
        this.loadAd = str;
    }

    public C3185l(String str, int i) {
        this.yandex = 1;
        Objects.requireNonNull(str);
        this.loadAd = str;
        this.crashlytics = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3185l(String str, int i, int i2) {
        this(str, false, (i2 & 2) != 0 ? 0 : i);
        this.yandex = 0;
    }
}
