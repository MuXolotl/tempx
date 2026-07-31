package defpackage;

import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.widget.ImageView;
import java.io.IOException;
import java.util.ArrayList;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lْْ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17891l {
    public static final void crashlytics(ImageView imageView, String str, Integer num, C10923l c10923l) {
        loadAd(imageView, (str == null || str.length() == 0) ? null : Uri.parse(str), num, c10923l);
    }

    public static final void loadAd(ImageView imageView, Uri uri, Integer num, C10923l c10923l) {
        LayerDrawable layerDrawableYandex;
        boolean z = c10923l.yandex instanceof C16849l;
        if (num != null && num.intValue() == R.drawable.placeholder_audio) {
            layerDrawableYandex = AbstractC16558l.yandex(imageView.getContext(), z, AbstractC13209l.yandex(R.attr.bg_primary), AbstractC13209l.yandex(R.attr.text_primary), R.drawable.ic_music_outline_28);
        } else if (num != null && num.intValue() == R.drawable.placeholder_link) {
            layerDrawableYandex = AbstractC16558l.yandex(imageView.getContext(), z, AbstractC13209l.yandex(R.attr.bg_primary), AbstractC13209l.yandex(R.attr.text_primary), R.drawable.ic_link_outline_28);
        } else {
            layerDrawableYandex = (num != null && num.intValue() == R.drawable.placeholder_playlist) ? AbstractC16558l.yandex(imageView.getContext(), z, AbstractC13209l.yandex(R.attr.bg_primary), AbstractC13209l.yandex(R.attr.text_primary), R.drawable.ic_playlist_outline_56) : null;
        }
        if (uri == null && layerDrawableYandex != null) {
            C13177l c13177lYandex = AbstractC2952l.yandex(imageView.getContext());
            C9477l c9477l = new C9477l(imageView.getContext());
            c9477l.crashlytics = layerDrawableYandex;
            AbstractC10413l.amazon(c9477l, imageView);
            c13177lYandex.yandex(c9477l.yandex());
            return;
        }
        if (uri != null || num == null) {
            C13177l c13177lYandex2 = AbstractC2952l.yandex(imageView.getContext());
            C9477l c9477l2 = new C9477l(imageView.getContext());
            c9477l2.crashlytics = uri;
            AbstractC10413l.amazon(c9477l2, imageView);
            imageView.getContext();
            yandex(c9477l2, num, layerDrawableYandex, c10923l);
            c13177lYandex2.yandex(c9477l2.yandex());
            return;
        }
        C13177l c13177lYandex3 = AbstractC2952l.yandex(imageView.getContext());
        C9477l c9477l3 = new C9477l(imageView.getContext());
        c9477l3.crashlytics = num;
        AbstractC10413l.amazon(c9477l3, imageView);
        imageView.getContext();
        yandex(c9477l3, num, layerDrawableYandex, c10923l);
        c13177lYandex3.yandex(c9477l3.yandex());
    }

    public static final void yandex(C9477l c9477l, Integer num, LayerDrawable layerDrawable, C10923l c10923l) throws IOException {
        AbstractC12872l.yandex(c9477l, true);
        int i = 9;
        if (num != null) {
            c9477l.vip = new C2221l(num.intValue(), 10);
            c9477l.metrica = new C2221l(num.intValue(), 9);
        }
        if (layerDrawable != null) {
            c9477l.vip = new C17015l(i, AbstractC3230l.crashlytics(layerDrawable));
            c9477l.metrica = new C17015l(i, AbstractC3230l.crashlytics(layerDrawable));
        }
        ArrayList arrayList = new ArrayList();
        AbstractC18586l abstractC18586l = c10923l.yandex;
        if (abstractC18586l instanceof C16849l) {
            arrayList.add(new C2192l());
        } else if (abstractC18586l instanceof C6985l) {
            VKXApplication.Companion companion = VKXApplication.f36628l;
            arrayList.add(new C1061l(VKXApplication.Companion.yandex(abstractC18586l.yandex)));
        }
        int i2 = c10923l.crashlytics;
        if (i2 != 0) {
            c9477l.crashlytics(i2);
        }
        AbstractC12872l.loadAd(c9477l, arrayList);
    }
}
