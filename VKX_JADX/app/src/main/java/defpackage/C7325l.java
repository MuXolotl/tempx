package defpackage;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؚٙؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7325l {
    public final C12840l loadAd;
    public final C12840l yandex;

    public C7325l(final AppActivity appActivity) {
        final int i = 0;
        this.yandex = appActivity.smaato(new InterfaceC18517l(this) { // from class: lٍُٕ
            @Override // defpackage.InterfaceC18517l
            public final void isPro(Object obj) throws UnsupportedEncodingException {
                int i2 = i;
                AppActivity appActivity2 = appActivity;
                Uri uri = (Uri) obj;
                switch (i2) {
                    case 0:
                        C7325l.yandex(appActivity2, uri);
                        break;
                    default:
                        C7325l.yandex(appActivity2, uri);
                        break;
                }
            }
        }, new C4739l(i));
        final int i2 = 1;
        this.loadAd = appActivity.smaato(new InterfaceC18517l(this) { // from class: lٍُٕ
            @Override // defpackage.InterfaceC18517l
            public final void isPro(Object obj) throws UnsupportedEncodingException {
                int i3 = i2;
                AppActivity appActivity2 = appActivity;
                Uri uri = (Uri) obj;
                switch (i3) {
                    case 0:
                        C7325l.yandex(appActivity2, uri);
                        break;
                    default:
                        C7325l.yandex(appActivity2, uri);
                        break;
                }
            }
        }, new C17423l(i));
    }

    public static void yandex(AppActivity appActivity, Uri uri) throws UnsupportedEncodingException {
        int i = 0;
        if (uri == null) {
            AbstractC11708l.yandex(new C15245l(i, appActivity, "Возвращенный URL оказался пустым.\nПожалуйста, проверьте выбранный путь и попробуйте еще раз."));
            return;
        }
        appActivity.getContentResolver().takePersistableUriPermission(uri, 3);
        String strDecode = URLDecoder.decode(uri.toString(), "UTF-8");
        C8994l.yandex.crashlytics(uri.toString());
        AbstractC11708l.yandex(new C15245l(i, appActivity, ((C6453l) appActivity.getResources()).yandex.getString(R.string.downloader_saf_picker_selected, strDecode)));
        C14704l c14704l = new C14704l(strDecode);
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        AbstractC12832l.mopub(c14704l, vKXApplication);
    }
}
