package defpackage;

import android.widget.ImageView;
import java.io.IOException;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٌؕۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3282l {
    public static void crashlytics(ImageView imageView, InterfaceC12360l interfaceC12360l, int i, float f, boolean z, int i2) throws IOException {
        Object objValueOf = interfaceC12360l;
        if (interfaceC12360l == null) {
            objValueOf = Integer.valueOf(i);
        }
        C13177l c13177lYandex = AbstractC2952l.yandex(imageView.getContext());
        C9477l c9477l = new C9477l(imageView.getContext());
        c9477l.crashlytics = objValueOf;
        AbstractC10413l.amazon(c9477l, imageView);
        AbstractC10413l.yandex(c9477l, false);
        c9477l.vip = new C2221l(i, 10);
        c9477l.metrica = new C2221l(i, 9);
        if (z || f > 0.0f) {
            C10227l c10227lAdmob = AbstractC14055l.admob();
            if (f > 0.0f) {
                VKXApplication.Companion companion = VKXApplication.f36628l;
                c10227lAdmob.add(new C1061l(VKXApplication.Companion.yandex(f)));
            }
            if (z) {
                c10227lAdmob.add(new C14074l(imageView.getContext(), 2.5f));
            }
            AbstractC12872l.loadAd(c9477l, AbstractC14055l.purchase(c10227lAdmob));
        }
        c9477l.crashlytics(AbstractC9029l.purchase(i2));
        c13177lYandex.yandex(c9477l.yandex());
    }

    public static void loadAd(ImageView imageView, AudioPlaylist audioPlaylist, int i, int i2) {
        crashlytics(imageView, audioPlaylist, R.drawable.placeholder_playlist, 8.0f, (i2 & 4) == 0, i);
    }

    public static void yandex(ImageView imageView, AudioTrack audioTrack, int i) {
        crashlytics(imageView, audioTrack, R.drawable.placeholder_audio, 8.0f, false, i);
    }
}
