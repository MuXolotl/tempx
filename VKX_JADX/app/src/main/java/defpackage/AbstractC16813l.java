package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lٗؐؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16813l {
    public static final C1579l yandex = new C1579l(2);
    public static final C2351l loadAd = new C2351l(14);

    public static C5882l[] crashlytics(Context context, C17129l c17129l, String str) {
        InterfaceC8475l c5008l;
        Trace.beginSection("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            if (Build.VERSION.SDK_INT < 24) {
                c5008l = new C5008l(context, uriBuild);
            } else {
                C15053l c15053l = new C15053l();
                c15053l.f29576l = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                c5008l = c15053l;
            }
            Cursor cursorSmaato = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.beginSection("ContentQueryWrapper.query");
                try {
                    cursorSmaato = c5008l.smaato(uriBuild, strArr, new String[]{c17129l.crashlytics});
                    Trace.endSection();
                    if (cursorSmaato != null && cursorSmaato.getCount() > 0) {
                        int columnIndex = cursorSmaato.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursorSmaato.getColumnIndex("_id");
                        int columnIndex3 = cursorSmaato.getColumnIndex("file_id");
                        int columnIndex4 = cursorSmaato.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorSmaato.getColumnIndex("font_weight");
                        int columnIndex6 = cursorSmaato.getColumnIndex("font_italic");
                        while (cursorSmaato.moveToNext()) {
                            int i = columnIndex != -1 ? cursorSmaato.getInt(columnIndex) : 0;
                            ArrayList arrayList3 = arrayList2;
                            arrayList3.add(new C5882l(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorSmaato.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorSmaato.getLong(columnIndex3)), columnIndex4 != -1 ? cursorSmaato.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorSmaato.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorSmaato.getInt(columnIndex6) == 1, c17129l.billing, i));
                            arrayList2 = arrayList3;
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorSmaato != null) {
                        cursorSmaato.close();
                    }
                    c5008l.close();
                    return (C5882l[]) arrayList.toArray(new C5882l[0]);
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                if (cursorSmaato != null) {
                    cursorSmaato.close();
                }
                c5008l.close();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public static ProviderInfo loadAd(PackageManager packageManager, C17129l c17129l, Resources resources) {
        C2351l c2351l = loadAd;
        C1579l c1579l = yandex;
        Trace.beginSection("FontProvider.getProvider");
        try {
            List listSubs = c17129l.amazon;
            String str = c17129l.yandex;
            String str2 = c17129l.loadAd;
            if (listSubs == null) {
                listSubs = AbstractC7076l.subs(resources, 0);
            }
            C18036l c18036l = new C18036l();
            c18036l.yandex = str;
            c18036l.loadAd = str2;
            c18036l.crashlytics = listSubs;
            ProviderInfo providerInfo = (ProviderInfo) c1579l.loadAd(c18036l);
            if (providerInfo != null) {
                Trace.endSection();
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, c2351l);
            for (int i = 0; i < listSubs.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) listSubs.get(i));
                Collections.sort(arrayList2, c2351l);
                if (arrayList.size() == arrayList2.size()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList.size()) {
                            c1579l.crashlytics(c18036l, providerInfoResolveContentProvider);
                            Trace.endSection();
                            return providerInfoResolveContentProvider;
                        }
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            Trace.endSection();
            return null;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static C17368l yandex(Context context, List list) {
        String str;
        Typeface typefaceCrashlytics;
        Trace.beginSection("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                C17129l c17129l = (C17129l) list.get(i);
                if (Build.VERSION.SDK_INT < 31 || (typefaceCrashlytics = AbstractC7618l.crashlytics((str = c17129l.purchase))) == null || AbstractC7618l.amazon(typefaceCrashlytics) == null) {
                    ProviderInfo providerInfoLoadAd = loadAd(context.getPackageManager(), c17129l, context.getResources());
                    if (providerInfoLoadAd == null) {
                        return new C17368l();
                    }
                    arrayList.add(crashlytics(context, c17129l, providerInfoLoadAd.authority));
                } else {
                    arrayList.add(new C5882l[]{new C5882l(str, c17129l.billing)});
                }
            }
            return new C17368l(arrayList);
        } finally {
            Trace.endSection();
        }
    }
}
