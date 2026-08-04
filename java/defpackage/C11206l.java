package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import ua.itaysonlab.vkapi2.objects.music.AudioWidgetItem;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;

/* JADX INFO: renamed from: lُْٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11206l {
    public static final long loadAd;
    public static final C11206l yandex = new C11206l();

    static {
        C6760l c6760l = C9658l.f19699l;
        loadAd = AbstractC15918l.tapsense(1, EnumC16636l.DAYS);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable loadAd(C14690l c14690l, EnumC3578l enumC3578l, AbstractC0283l abstractC0283l) {
        C16470l c16470l;
        C14690l c14690l2;
        if (abstractC0283l instanceof C16470l) {
            c16470l = (C16470l) abstractC0283l;
            int i = c16470l.f32196l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c16470l.f32196l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c16470l = new C16470l(this, abstractC0283l);
            }
        } else {
            c16470l = new C16470l(this, abstractC0283l);
        }
        Object objYandex = c16470l.f32199l;
        int i2 = c16470l.f32196l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objYandex);
            if (System.currentTimeMillis() < C9658l.amazon(loadAd) + c14690l.f28753l) {
                return null;
            }
            EnumC15312l enumC15312l = c14690l.f28754l;
            c16470l.f32198l = c14690l;
            c16470l.f32197l = c14690l;
            c16470l.f32196l = 1;
            objYandex = yandex(enumC15312l, enumC3578l, c16470l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objYandex == enumC9342l) {
                return enumC9342l;
            }
            c14690l2 = c14690l;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C14690l c14690l3 = c16470l.f32197l;
            C14690l c14690l4 = c16470l.f32198l;
            AbstractC2829l.crashlytics(objYandex);
            c14690l2 = c14690l3;
            c14690l = c14690l4;
        }
        Collection collection = (Collection) objYandex;
        if (collection.isEmpty()) {
            collection = c14690l.f28755l;
        }
        return C14690l.loadAd(c14690l2, null, (List) collection, System.currentTimeMillis(), 9);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [lٛۤ] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Serializable] */
    public final Serializable yandex(EnumC15312l enumC15312l, EnumC3578l enumC3578l, AbstractC0283l abstractC0283l) {
        C5090l c5090l;
        ?? c18435l;
        String str;
        String str2;
        if (abstractC0283l instanceof C5090l) {
            c5090l = (C5090l) abstractC0283l;
            int i = c5090l.f11098l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c5090l.f11098l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c5090l = new C5090l(this, abstractC0283l);
            }
        } else {
            c5090l = new C5090l(this, abstractC0283l);
        }
        Object objAdcel = c5090l.f11097l;
        int i2 = c5090l.f11098l;
        C2580l c2580l = C2580l.f5619l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(objAdcel);
                int iOrdinal = enumC3578l.ordinal();
                if (iOrdinal == 0) {
                    str = "small";
                } else if (iOrdinal == 1) {
                    str = "medium";
                } else {
                    if (iOrdinal != 2) {
                        throw new C6451l(11);
                    }
                    str = "large";
                }
                int iOrdinal2 = enumC15312l.ordinal();
                if (iOrdinal2 == 0) {
                    str2 = "recomms";
                } else {
                    if (iOrdinal2 != 1) {
                        throw new C6451l(11);
                    }
                    str2 = "mymusic";
                }
                C16534l c16534l = new C16534l(str, str2);
                c5090l.f11098l = 1;
                objAdcel = c16534l.adcel(c5090l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objAdcel == enumC9342l) {
                    return enumC9342l;
                }
            } else {
                if (i2 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(objAdcel);
            }
            List<AudioWidgetItem> list = (List) objAdcel;
            if (list == null) {
                list = c2580l;
            }
            c18435l = new ArrayList(AbstractC14055l.billing(list, 10));
            for (AudioWidgetItem audioWidgetItem : list) {
                String str3 = audioWidgetItem.crashlytics;
                String str4 = audioWidgetItem.loadAd;
                String str5 = audioWidgetItem.amazon;
                String str6 = audioWidgetItem.purchase;
                AlbumThumb albumThumb = audioWidgetItem.yandex;
                String str7 = albumThumb != null ? albumThumb.crashlytics : null;
                if (str7 == null) {
                    str7 = "";
                }
                c18435l.add(new C0884l(str3, str4, str5, str7, str6, C3844l.f7950l));
            }
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        return C1171l.yandex(c18435l) == null ? c18435l : c2580l;
    }
}
