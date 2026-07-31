package defpackage;

import android.net.Uri;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lٟؗؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4586l {
    public static final Pattern crashlytics;
    public static final Pattern loadAd;
    public static final Uri yandex = Uri.parse("content://com.google.android.gsf.gservices");

    static {
        Uri.parse("content://com.google.android.gsf.gservices/prefix");
        loadAd = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        crashlytics = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    }
}
