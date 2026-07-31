package defpackage;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: lۣ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18659l {
    public static final C18659l yandex = new C18659l();
    public static final LinkedHashMap loadAd = new LinkedHashMap();

    /* JADX WARN: Code duplicated, block: B:27:0x0080 A[PHI: r5
  0x0080: PHI (r5v1 android.net.Uri) = (r5v0 android.net.Uri), (r5v2 android.net.Uri), (r5v2 android.net.Uri) binds: [B:19:0x0067, B:24:0x0078, B:26:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Comparable yandex(Uri uri, AbstractC0283l abstractC0283l) {
        C16254l c16254l;
        if (abstractC0283l instanceof C16254l) {
            c16254l = (C16254l) abstractC0283l;
            int i = c16254l.f31811l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c16254l.f31811l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c16254l = new C16254l(this, abstractC0283l);
            }
        } else {
            c16254l = new C16254l(this, abstractC0283l);
        }
        Object objYandex = c16254l.f31812l;
        int i2 = c16254l.f31811l;
        Uri uri2 = null;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objYandex);
            ArrayList arrayList = AbstractC18569l.yandex;
            if (AbstractC8576l.yandex(uri.getScheme(), "vkx") && uri.getPathSegments().size() == 2) {
                String str = uri.getPathSegments().get(0);
                String str2 = uri.getPathSegments().get(1);
                C18003l c18003l = (C18003l) loadAd.get(str);
                if (c18003l != null) {
                    c16254l.f31813l = uri;
                    c16254l.f31811l = 1;
                    objYandex = c18003l.yandex(str2, c16254l);
                    EnumC9342l enumC9342l = EnumC9342l.f19165l;
                    if (objYandex == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    uri2 = uri;
                }
            }
            ArrayList arrayList2 = AbstractC18569l.yandex;
            return uri2;
        }
        if (i2 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uri = c16254l.f31813l;
        AbstractC2829l.crashlytics(objYandex);
        String str3 = (String) objYandex;
        if (str3 == null || (uri2 = Uri.parse(str3)) == null) {
            uri2 = uri;
        }
        ArrayList arrayList3 = AbstractC18569l.yandex;
        return uri2;
    }
}
