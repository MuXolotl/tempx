package defpackage;

import java.util.Arrays;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٜؒۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1193l {
    public static final C11090l amazon;
    public static final C2122l crashlytics;
    public static final C2122l loadAd;
    public static final C2122l yandex;

    static {
        C3407l c3407lYandex = AbstractC13251l.yandex(R.font.vk_sans_text_light, C6886l.f14422l);
        C6886l c6886l = C6886l.f14425l;
        C3407l c3407lYandex2 = AbstractC13251l.yandex(R.font.vk_sans_text_regular, c6886l);
        C6886l c6886l2 = C6886l.f14419l;
        C3407l c3407lYandex3 = AbstractC13251l.yandex(R.font.vk_sans_text_medium, c6886l2);
        C6886l c6886l3 = C6886l.f14420l;
        C3407l c3407lYandex4 = AbstractC13251l.yandex(R.font.vk_sans_text_demibold, c6886l3);
        C6886l c6886l4 = C6886l.f14424l;
        yandex = new C2122l(Arrays.asList(c3407lYandex, c3407lYandex2, c3407lYandex3, c3407lYandex4, AbstractC13251l.yandex(R.font.vk_sans_text_bold, c6886l4)));
        C2122l c2122l = new C2122l(Arrays.asList(AbstractC13251l.yandex(R.font.vk_sans_display_regular, c6886l), AbstractC13251l.yandex(R.font.vk_sans_display_medium, c6886l2), AbstractC13251l.yandex(R.font.vk_sans_display_demibold, c6886l3), AbstractC13251l.yandex(R.font.vk_sans_display_bold, c6886l4)));
        loadAd = c2122l;
        crashlytics = new C2122l(Arrays.asList(AbstractC13251l.yandex(R.font.vk_sans_display_condensed_demibold, c6886l3)));
        amazon = new C11090l(0L, 0L, c6886l3, c2122l, 0L, 0L, 0, 0, 0L, 16777179);
    }
}
