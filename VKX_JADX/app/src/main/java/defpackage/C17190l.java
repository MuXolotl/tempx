package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.util.EnumMap;

/* JADX INFO: renamed from: lٗ٘ؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C17190l implements InterfaceC9330l, InterfaceC10162l, InterfaceC16013l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f33367l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33368l;

    public C17190l(int i) {
        this.f33368l = i;
        switch (i) {
            case 1:
                this.f33367l = new EnumMap(EnumC3170l.class);
                break;
        }
    }

    public void amazon(EnumC3170l enumC3170l, EnumC3176l enumC3176l) {
        ((EnumMap) this.f33367l).put(enumC3170l, enumC3176l);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    public void crashlytics(EnumC3170l enumC3170l, int i) {
        EnumC3176l enumC3176l;
        if (i == -30) {
            enumC3176l = EnumC3176l.TCF;
        } else if (i == -20) {
            enumC3176l = EnumC3176l.API;
        } else if (i == -10) {
            enumC3176l = EnumC3176l.MANIFEST;
        } else if (i != 0) {
            enumC3176l = i != 30 ? EnumC3176l.UNSET : EnumC3176l.INITIALIZATION;
        } else {
            enumC3176l = EnumC3176l.API;
        }
        ((EnumMap) this.f33367l).put(enumC3170l, enumC3176l);
    }

    @Override // defpackage.InterfaceC9330l
    public void firebase(InterfaceC9719l interfaceC9719l, byte[] bArr, int i) {
        C16638l c16638l = (C16638l) this.f33367l;
        c16638l.getClass();
        byte[] bArr2 = new byte[56];
        System.arraycopy(((C14685l) interfaceC9719l).f28737l, 0, bArr2, 0, 56);
        byte[] bArr3 = c16638l.f32614l;
        int[] iArr = new int[14];
        for (int i2 = 0; i2 < 14; i2++) {
            iArr[i2] = AbstractC6791l.firebase(i2 * 4, bArr3);
        }
        iArr[0] = iArr[0] & (-4);
        iArr[13] = iArr[13] | RecyclerView.UNDEFINED_DURATION;
        int[] iArr2 = new int[16];
        AbstractC6791l.smaato(bArr2, iArr2);
        int[] iArr3 = new int[16];
        AbstractC6791l.billing(0, 0, iArr2, iArr3);
        int[] iArr4 = new int[16];
        iArr4[0] = 1;
        int[] iArr5 = new int[16];
        iArr5[0] = 1;
        int[] iArr6 = new int[16];
        int[] iArr7 = new int[16];
        int[] iArr8 = new int[16];
        int i3 = 447;
        int i4 = 1;
        while (true) {
            AbstractC6791l.crashlytics(iArr5, iArr6, iArr7);
            AbstractC6791l.advert(iArr5, iArr6, iArr5);
            AbstractC6791l.crashlytics(iArr3, iArr4, iArr6);
            AbstractC6791l.advert(iArr3, iArr4, iArr3);
            AbstractC6791l.tapsense(iArr7, iArr3, iArr7);
            AbstractC6791l.tapsense(iArr5, iArr6, iArr5);
            AbstractC6791l.ad(iArr6, iArr6);
            AbstractC6791l.ad(iArr3, iArr3);
            AbstractC6791l.advert(iArr6, iArr3, iArr8);
            AbstractC6791l.subscription(39082, iArr8, iArr4);
            AbstractC6791l.crashlytics(iArr4, iArr3, iArr4);
            AbstractC6791l.tapsense(iArr4, iArr8, iArr4);
            AbstractC6791l.tapsense(iArr3, iArr6, iArr3);
            AbstractC6791l.advert(iArr7, iArr5, iArr6);
            AbstractC6791l.crashlytics(iArr7, iArr5, iArr5);
            AbstractC6791l.ad(iArr5, iArr5);
            AbstractC6791l.ad(iArr6, iArr6);
            AbstractC6791l.tapsense(iArr6, iArr2, iArr6);
            i3--;
            int i5 = (iArr[i3 >>> 5] >>> (i3 & 31)) & 1;
            int i6 = i4 ^ i5;
            AbstractC6791l.mopub(i6, iArr3, iArr5);
            AbstractC6791l.mopub(i6, iArr4, iArr6);
            if (i3 < 2) {
                break;
            } else {
                i4 = i5;
            }
        }
        for (int i7 = 0; i7 < 2; i7++) {
            int[] iArr9 = new int[16];
            int[] iArr10 = new int[16];
            AbstractC6791l.crashlytics(iArr3, iArr4, iArr9);
            AbstractC6791l.advert(iArr3, iArr4, iArr10);
            AbstractC6791l.ad(iArr9, iArr9);
            AbstractC6791l.ad(iArr10, iArr10);
            AbstractC6791l.tapsense(iArr9, iArr10, iArr3);
            AbstractC6791l.advert(iArr9, iArr10, iArr9);
            AbstractC6791l.subscription(39082, iArr9, iArr4);
            AbstractC6791l.crashlytics(iArr4, iArr10, iArr4);
            AbstractC6791l.tapsense(iArr4, iArr9, iArr4);
        }
        AbstractC6791l.adcel(iArr4, iArr4);
        AbstractC6791l.tapsense(iArr3, iArr4, iArr3);
        AbstractC6791l.license(iArr3, 1);
        AbstractC6791l.license(iArr3, -1);
        AbstractC6791l.vip(i, bArr, iArr3);
        int i8 = 0;
        for (int i9 = 0; i9 < 56; i9++) {
            i8 |= bArr[i + i9];
        }
        if (i8 != 0) {
            return;
        }
        C8339l.smaato("X448 agreement failed");
    }

    @Override // defpackage.InterfaceC9330l
    public void init(InterfaceC9719l interfaceC9719l) {
        this.f33367l = (C16638l) interfaceC9719l;
        ((C5911l) AbstractC8776l.purchase.get()).getClass();
    }

    public boolean loadAd() {
        C8118l c8118l = ((C17417l) this.f33367l).f33950l;
        C17417l.admob(c8118l);
        return Log.isLoggable(c8118l.m2266l(), 3);
    }

    @Override // defpackage.InterfaceC10162l
    public void metrica(C3823l c3823l) {
        switch (this.f33368l) {
            case 2:
                C1062l c1062l = (C1062l) this.f33367l;
                c1062l.firebase.crashlytics(c1062l, "connection");
                C14138l c14138l = c1062l.isPro;
                c14138l.getClass();
                C11319l c11319l = new C11319l(c1062l.billing);
                HandlerC4052l handlerC4052l = c14138l.f27638l;
                handlerC4052l.sendMessage(handlerC4052l.obtainMessage(14, c11319l));
                C3823l c3823l2 = c11319l.loadAd.yandex;
                break;
            default:
                ((C0189l) ((BinderC3285l) this.f33367l).mopub).amazon("joinApplication", c3823l);
                break;
        }
    }

    @Override // defpackage.InterfaceC9330l
    public int remoteconfig() {
        return 56;
    }

    public String toString() {
        switch (this.f33368l) {
            case 1:
                StringBuilder sb = new StringBuilder("1");
                for (EnumC3170l enumC3170l : EnumC3170l.values()) {
                    EnumC3176l enumC3176l = (EnumC3176l) ((EnumMap) this.f33367l).get(enumC3170l);
                    if (enumC3176l == null) {
                        enumC3176l = EnumC3176l.UNSET;
                    }
                    sb.append(enumC3176l.f6836l);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC16013l
    public void yandex(Bitmap bitmap) {
        ((C9937l) this.f33367l).crashlytics(bitmap, 3);
    }

    public /* synthetic */ C17190l(int i, Object obj) {
        this.f33368l = i;
        this.f33367l = obj;
    }

    public C17190l(C17120l c17120l, C17417l c17417l) {
        this.f33368l = 3;
        this.f33367l = c17417l;
    }

    public C17190l(EnumMap enumMap) {
        this.f33368l = 1;
        EnumMap enumMap2 = new EnumMap(EnumC3170l.class);
        this.f33367l = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
