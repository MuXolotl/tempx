package ua.itaysonlab.vkapi2.objects.music;

import defpackage.AbstractC11036l;
import defpackage.AbstractC9968l;
import defpackage.C0063l;
import defpackage.C11521l;
import defpackage.C14092l;
import defpackage.C14865l;
import defpackage.C7764l;
import defpackage.EnumC12758l;
import defpackage.InterfaceC1220l;
import defpackage.InterfaceC15749l;
import defpackage.InterfaceC8296l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioChartInfo;", "", "Companion", "lّٟٝ", "lًؔۙ", "lؙْٔ", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC8296l
@InterfaceC15749l(generateAdapter = true)
public final class AudioChartInfo {
    public static final C14865l Companion = new C14865l();
    public static final InterfaceC1220l[] amazon = {null, null, AbstractC9968l.crashlytics(2, new C0063l(22))};
    public final transient EnumC12758l crashlytics;
    public final int loadAd;
    public final int yandex;

    public AudioChartInfo(int i, int i2, int i3, EnumC12758l enumC12758l) {
        Object obj = null;
        if (1 != (i & 1)) {
            AbstractC11036l.isPro(i, 1, C7764l.yandex.purchase());
            throw null;
        }
        this.yandex = i2;
        if ((i & 2) == 0) {
            this.loadAd = -1;
        } else {
            this.loadAd = i3;
        }
        if ((i & 4) != 0) {
            this.crashlytics = enumC12758l;
            return;
        }
        C14092l c14092l = EnumC12758l.f25137l;
        c14092l.getClass();
        C11521l c11521l = new C11521l(0, c14092l);
        while (c11521l.hasNext()) {
            Object next = c11521l.next();
            if (((EnumC12758l) next).f25140l == this.loadAd) {
                obj = next;
                break;
            }
        }
        EnumC12758l enumC12758l2 = (EnumC12758l) obj;
        this.crashlytics = enumC12758l2 == null ? EnumC12758l.UNKNOWN : enumC12758l2;
    }

    public AudioChartInfo(int i, int i2) {
        Object next;
        this.yandex = i;
        this.loadAd = i2;
        C14092l c14092l = EnumC12758l.f25137l;
        c14092l.getClass();
        C11521l c11521l = new C11521l(0, c14092l);
        do {
            if (!c11521l.hasNext()) {
                next = null;
                break;
            }
            next = c11521l.next();
        } while (((EnumC12758l) next).f25140l != this.loadAd);
        EnumC12758l enumC12758l = (EnumC12758l) next;
        this.crashlytics = enumC12758l == null ? EnumC12758l.UNKNOWN : enumC12758l;
    }
}
