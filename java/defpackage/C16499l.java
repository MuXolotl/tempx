package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٖٜٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16499l implements InterfaceC2262l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C16499l f32230l = new C16499l();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C18662l f32231l = AbstractC11990l.loadAd();

    public static String amazon(CatalogArtist catalogArtist) {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(AbstractC9549l.purchase);
        sb.append("/music/artist/");
        String str = catalogArtist.crashlytics;
        if (str == null) {
            str = catalogArtist.loadAd;
        }
        sb.append(str);
        return sb.toString();
    }

    public static void loadAd(Activity activity, String str, String str2, String str3) {
        if (str3 == null || str3.length() == 0) {
            yandex(activity, str, str2, null);
            return;
        }
        C13177l c13177lYandex = AbstractC2952l.yandex(activity);
        C9477l c9477l = new C9477l(activity);
        c9477l.crashlytics = str3;
        c9477l.amazon = new C1424l(activity, str, str2, activity, str, str2);
        c13177lYandex.yandex(c9477l.yandex());
    }

    public static void yandex(Activity activity, String str, String str2, File file) {
        Uri uriAmazon;
        if (file != null) {
            uriAmazon = Build.VERSION.SDK_INT >= 24 ? FileProvider.amazon(activity, file) : Uri.fromFile(file);
        } else {
            uriAmazon = null;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putExtra("android.intent.extra.TITLE", str2);
        intent.setDataAndType(uriAmazon, "text/plain");
        if (uriAmazon != null) {
            intent.setClipData(ClipData.newRawUri(null, uriAmazon));
        }
        intent.setFlags(1);
        activity.startActivity(Intent.createChooser(intent, activity.getResources().getText(R.string.share)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object crashlytics(Context context, Bitmap bitmap, AbstractC0283l abstractC0283l) throws Throwable {
        C18457l c18457l;
        if (abstractC0283l instanceof C18457l) {
            c18457l = (C18457l) abstractC0283l;
            int i = c18457l.f36053l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c18457l.f36053l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c18457l = new C18457l(this, abstractC0283l);
            }
        } else {
            c18457l = new C18457l(this, abstractC0283l);
        }
        Object obj = c18457l.f36054l;
        int i2 = c18457l.f36053l;
        InterfaceC14029l interfaceC14029l = null;
        if (i2 != 0) {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            File file = c18457l.f36055l;
            AbstractC2829l.crashlytics(obj);
            return file;
        }
        AbstractC2829l.crashlytics(obj);
        File file2 = new File(context.getCacheDir(), "augshare_cache.jpg");
        C16552l c16552l = AbstractC11463l.yandex;
        ExecutorC6708l executorC6708l = ExecutorC6708l.f14063l;
        C13624l c13624l = new C13624l(file2, bitmap, interfaceC14029l, 2);
        c18457l.f36055l = file2;
        c18457l.f36053l = 1;
        Object objFirebase = AbstractC10999l.firebase(executorC6708l, c13624l, c18457l);
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        return objFirebase == enumC9342l ? enumC9342l : file2;
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f32231l.f36440l;
    }
}
