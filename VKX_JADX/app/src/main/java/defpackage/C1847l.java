package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Process;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lٖؓٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1847l {
    public final Map amazon;
    public final LinkedHashMap crashlytics = new LinkedHashMap();
    public final PackageManager loadAd;
    public final C8688l purchase;
    public final Context yandex;

    public C1847l(Context context, PackageManager packageManager) {
        this.yandex = context;
        this.loadAd = packageManager;
        Boolean bool = Boolean.TRUE;
        C0569l c0569l = new C0569l(new C8195l("1c:a8:dc:c0:be:d3:cb:d8:72:d2:cb:79:12:00:c0:29:2c:a9:97:57:68:a8:2d:67:6b:8b:42:4f:b6:5b:52:95", bool));
        Boolean bool2 = Boolean.FALSE;
        this.amazon = AbstractC8676l.remoteconfig(new C8195l("com.google.android.projection.gearhead", new C13395l(new C8195l("Android Auto", new C0569l[]{c0569l, new C0569l(new C8195l("19:75:b2:f1:71:77:bc:89:a5:df:f3:1f:9e:64:a6:ca:e2:81:a5:3d:c1:d1:d5:9b:1d:14:7f:e1:c8:2a:fa:00", bool2)), new C0569l(new C8195l("70:81:1a:3e:ac:fd:2e:83:e1:8d:a9:bf:ed:e5:2d:f1:6c:e9:1f:2e:69:a4:4d:21:f1:8a:b6:69:91:13:07:71", bool2)), new C0569l(new C8195l("fd:b0:0c:43:db:de:8b:51:cb:31:2a:a8:1d:3b:5f:a1:77:13:ad:b9:4b:28:f5:98:d7:7f:8e:b8:9d:ac:ee:df", bool))}))), new C8195l("com.google.android.wearable.app", new C13395l(new C8195l("WearOS", new C0569l[]{new C0569l(new C8195l("69:d0:72:16:9a:2c:6b:2f:5a:cc:59:0c:e4:33:a1:1a:c3:df:55:1a:df:ee:5d:5f:63:c0:83:b7:22:76:2e:19", bool2)), new C0569l(new C8195l("85:cd:59:73:54:1b:e6:f4:77:d8:47:a0:bc:c6:aa:25:27:68:4b:81:9c:d5:96:85:29:66:4c:b0:71:57:b6:fe", bool))}))), new C8195l("com.google.android.autosimulator", new C13395l(new C8195l("Android Auto Simulator", new C0569l[]{new C0569l(new C8195l("19:75:b2:f1:71:77:bc:89:a5:df:f3:1f:9e:64:a6:ca:e2:81:a5:3d:c1:d1:d5:9b:1d:14:7f:e1:c8:2a:fa:00", bool))}))), new C8195l("com.google.android.googlequicksearchbox", new C13395l(new C8195l("Google", new C0569l[]{new C0569l(new C8195l("19:75:b2:f1:71:77:bc:89:a5:df:f3:1f:9e:64:a6:ca:e2:81:a5:3d:c1:d1:d5:9b:1d:14:7f:e1:c8:2a:fa:00", bool2)), new C0569l(new C8195l("f0:fd:6c:5b:41:0f:25:cb:25:c3:b5:33:46:c8:97:2f:ae:30:f8:ee:74:11:df:91:04:80:ad:6b:2d:60:db:83", bool))}))), new C8195l("com.google.android.carassistant", new C13395l(new C8195l("Google Assistant on Android Automotive OS", new C0569l[]{new C0569l(new C8195l("17:E2:81:11:06:2F:97:A8:60:79:7A:83:70:5B:F8:2C:7C:C0:29:35:56:6D:46:22:BC:4E:CF:EE:1B:EB:F8:15", bool2)), new C0569l(new C8195l("74:B6:FB:F7:10:E8:D9:0D:44:D3:40:12:58:89:B4:23:06:A6:2C:43:79:D0:E5:A6:62:20:E3:A6:8A:BF:90:E2", bool))}))));
        this.purchase = new C8688l(new C5767l(7, this));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b6  */
    public final boolean loadAd(C6499l c6499l) throws NoSuchAlgorithmException {
        Boolean bool;
        C0569l[] c0569lArr;
        C0569l c0569l;
        boolean z;
        C16701l c16701l = c6499l.yandex;
        C14996l c14996l = c16701l.yandex;
        C14996l c14996l2 = c16701l.yandex;
        int i = c14996l.crashlytics;
        int iMyUid = Process.myUid();
        Context context = this.yandex;
        C8195l c8195l = null;
        if (i == iMyUid || c14996l2.crashlytics == 1000 || AbstractC8576l.yandex(c14996l2.yandex, context.getPackageName()) || AbstractC8576l.yandex(c14996l2.yandex, "android.media.session.MediaController")) {
            bool = Boolean.TRUE;
        } else if (AbstractC8576l.yandex(c14996l2.yandex, "android.intent.action.MEDIA_BUTTON")) {
            bool = Boolean.FALSE;
        } else {
            bool = AbstractC8576l.yandex(c14996l2.yandex, "android.media.browse.MediaBrowserService") ? Boolean.TRUE : null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        String str = c14996l2.yandex;
        LinkedHashMap linkedHashMap = this.crashlytics;
        C4339l c4339l = (C4339l) linkedHashMap.get(str);
        C8195l c8195l2 = c4339l != null ? c4339l.yandex : null;
        if (c8195l2 != null && ((Number) c8195l2.f17098l).intValue() == c14996l2.crashlytics) {
            return ((Boolean) c8195l2.f17097l).booleanValue();
        }
        try {
            C8195l c8195lYandex = yandex(c14996l2.yandex);
            Object obj = c8195lYandex.f17098l;
            String str2 = (String) c8195lYandex.f17097l;
            if (str2 == null) {
                linkedHashMap.put(c14996l2.yandex, new C4339l(new C8195l(Integer.valueOf(c14996l2.crashlytics), Boolean.FALSE)));
                return false;
            }
            if (!AbstractC8576l.yandex(str2, (String) this.purchase.getValue())) {
                List list = (List) obj;
                if (!list.contains("android.permission.MEDIA_CONTENT_CONTROL") && !list.contains("android.permission.BIND_NOTIFICATION_LISTENER_SERVICE")) {
                    if (!((HashSet) C7406l.yandex(context)).contains(c14996l2.yandex)) {
                        C13395l c13395l = (C13395l) this.amazon.get(c14996l2.yandex);
                        C8195l c8195l3 = c13395l != null ? c13395l.yandex : null;
                        if (c8195l3 != null && (c0569lArr = (C0569l[]) c8195l3.f17097l) != null) {
                            int length = c0569lArr.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length) {
                                    c0569l = null;
                                    break;
                                }
                                c0569l = c0569lArr[i2];
                                if (AbstractC16648l.license((String) c0569l.yandex.f17098l, str2, true)) {
                                    break;
                                }
                                i2++;
                            }
                            if (c0569l != null) {
                                c8195l = c0569l.yandex;
                            }
                        }
                        z = c8195l != null;
                    }
                }
            }
            linkedHashMap.put(c14996l2.yandex, new C4339l(new C8195l(Integer.valueOf(c14996l2.crashlytics), Boolean.valueOf(z))));
            return z;
        } catch (PackageManager.NameNotFoundException unused) {
            linkedHashMap.put(c14996l2.yandex, new C4339l(new C8195l(Integer.valueOf(c14996l2.crashlytics), Boolean.FALSE)));
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [lّؔۜ] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    public final C8195l yandex(String str) throws PackageManager.NameNotFoundException, NoSuchAlgorithmException {
        Object arrayList;
        Signature signature;
        byte[] byteArray;
        Signature[] signingCertificateHistory;
        Signature signature2;
        Integer numM2405for;
        PackageInfo packageInfo = this.loadAd.getPackageInfo(str, (Build.VERSION.SDK_INT >= 28 ? 134217728 : 64) | 4096);
        String[] strArr = packageInfo.requestedPermissions;
        String strM2397case = null;
        if (strArr != null) {
            arrayList = new ArrayList();
            int length = strArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                String str2 = strArr[i];
                int i3 = i2 + 1;
                int[] iArr = packageInfo.requestedPermissionsFlags;
                if ((((iArr == null || (numM2405for = AbstractC8669l.m2405for(iArr, i2)) == null) ? 0 : numM2405for.intValue()) & 2) == 0) {
                    str2 = null;
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
                i++;
                i2 = i3;
            }
        } else {
            arrayList = C2580l.f5619l;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            SigningInfo signingInfo = packageInfo.signingInfo;
            if (signingInfo == null || (signingCertificateHistory = signingInfo.getSigningCertificateHistory()) == null || (signature2 = (Signature) AbstractC8669l.m2412private(signingCertificateHistory)) == null) {
                byteArray = null;
            } else {
                byteArray = signature2.toByteArray();
            }
        } else {
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null || (signature = (Signature) AbstractC8669l.m2412private(signatureArr)) == null) {
                byteArray = null;
            } else {
                byteArray = signature.toByteArray();
            }
        }
        if (byteArray != null) {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
            messageDigest.update(byteArray);
            strM2397case = AbstractC8669l.m2397case(messageDigest.digest(), ":", new C1698l(4), 30);
        }
        return new C8195l(arrayList, strM2397case);
    }
}
