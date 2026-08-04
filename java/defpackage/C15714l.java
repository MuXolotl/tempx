package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.car.app.model.Alert;
import java.util.Map;

/* JADX INFO: renamed from: lؙٕٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15714l implements InterfaceC9330l, InterfaceC11545l, InterfaceC15111l, InterfaceC16013l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Object f30857l;

    public /* synthetic */ C15714l(Object obj) {
        this.f30857l = obj;
    }

    @Override // defpackage.InterfaceC11545l
    public void accept(Object obj, Object obj2) {
        ((InterfaceC2227l) this.f30857l).crashlytics((C11963l) obj);
        ((C2350l) obj2).loadAd(null);
    }

    @Override // defpackage.InterfaceC9330l
    public void firebase(InterfaceC9719l interfaceC9719l, byte[] bArr, int i) {
        C16244l c16244l = (C16244l) this.f30857l;
        c16244l.getClass();
        byte[] bArr2 = new byte[32];
        System.arraycopy(((C15654l) interfaceC9719l).f30601l, 0, bArr2, 0, 32);
        byte[] bArr3 = c16244l.f31795l;
        int[] iArr = new int[8];
        for (int i2 = 0; i2 < 8; i2++) {
            iArr[i2] = AbstractC11397l.vip(i2 * 4, bArr3);
        }
        iArr[0] = iArr[0] & (-8);
        int i3 = iArr[7] & Alert.DURATION_SHOW_INDEFINITELY;
        iArr[7] = i3;
        iArr[7] = i3 | 1073741824;
        int[] iArr2 = new int[10];
        AbstractC11397l.smaato(0, 0, bArr2, iArr2);
        AbstractC11397l.smaato(16, 5, bArr2, iArr2);
        iArr2[9] = iArr2[9] & 16777215;
        int[] iArr3 = new int[10];
        AbstractC11397l.isPro(0, 0, iArr2, iArr3);
        int[] iArr4 = new int[10];
        iArr4[0] = 1;
        int[] iArr5 = new int[10];
        iArr5[0] = 1;
        int[] iArr6 = new int[10];
        int[] iArr7 = new int[10];
        int[] iArr8 = new int[10];
        int i4 = 254;
        int i5 = 1;
        while (true) {
            AbstractC11397l.billing(iArr5, iArr6, iArr7, iArr5);
            AbstractC11397l.billing(iArr3, iArr4, iArr6, iArr3);
            AbstractC11397l.Signature(iArr7, iArr3, iArr7);
            AbstractC11397l.Signature(iArr5, iArr6, iArr5);
            AbstractC11397l.applovin(iArr6, iArr6);
            AbstractC11397l.applovin(iArr3, iArr3);
            AbstractC11397l.appmetrica(iArr6, iArr3, iArr8);
            AbstractC11397l.tapsense(iArr8, iArr4);
            AbstractC11397l.purchase(iArr4, iArr3, iArr4);
            AbstractC11397l.Signature(iArr4, iArr8, iArr4);
            AbstractC11397l.Signature(iArr3, iArr6, iArr3);
            AbstractC11397l.billing(iArr7, iArr5, iArr5, iArr6);
            AbstractC11397l.applovin(iArr5, iArr5);
            AbstractC11397l.applovin(iArr6, iArr6);
            AbstractC11397l.Signature(iArr6, iArr2, iArr6);
            i4--;
            int i6 = (iArr[i4 >>> 5] >>> (i4 & 31)) & 1;
            int i7 = i5 ^ i6;
            AbstractC11397l.firebase(i7, iArr3, iArr5);
            AbstractC11397l.firebase(i7, iArr4, iArr6);
            if (i4 < 3) {
                break;
            } else {
                i5 = i6;
            }
        }
        for (int i8 = 0; i8 < 3; i8++) {
            int[] iArr9 = new int[10];
            int[] iArr10 = new int[10];
            AbstractC11397l.billing(iArr3, iArr4, iArr9, iArr10);
            AbstractC11397l.applovin(iArr9, iArr9);
            AbstractC11397l.applovin(iArr10, iArr10);
            AbstractC11397l.Signature(iArr9, iArr10, iArr3);
            AbstractC11397l.appmetrica(iArr9, iArr10, iArr9);
            AbstractC11397l.tapsense(iArr9, iArr4);
            AbstractC11397l.purchase(iArr4, iArr10, iArr4);
            AbstractC11397l.Signature(iArr4, iArr9, iArr4);
        }
        AbstractC11397l.ads(iArr4, iArr4);
        AbstractC11397l.Signature(iArr3, iArr4, iArr3);
        AbstractC11397l.ad(iArr3);
        AbstractC11397l.metrica(0, i, bArr, iArr3);
        AbstractC11397l.metrica(5, i + 16, bArr, iArr3);
        int i9 = 0;
        for (int i10 = 0; i10 < 32; i10++) {
            i9 |= bArr[i + i10];
        }
        if (i9 != 0) {
            return;
        }
        C8339l.smaato("X25519 agreement failed");
    }

    @Override // defpackage.InterfaceC9330l
    public void init(InterfaceC9719l interfaceC9719l) {
        this.f30857l = (C16244l) interfaceC9719l;
        ((C5911l) AbstractC8776l.purchase.get()).getClass();
    }

    public void loadAd(int i, Object obj, InterfaceC12940l interfaceC12940l) {
        AbstractC10908l abstractC10908l = (AbstractC10908l) this.f30857l;
        AbstractC12570l abstractC12570l = (AbstractC12570l) obj;
        abstractC10908l.amazon(i, 2);
        abstractC10908l.ads(abstractC12570l.crashlytics(interfaceC12940l));
        interfaceC12940l.crashlytics(abstractC12570l, this);
    }

    @Override // defpackage.InterfaceC15111l, defpackage.InterfaceC11139l
    public /* synthetic */ void purchase(String str, int i, Throwable th, byte[] bArr, Map map) {
        ((C17417l) this.f30857l).amazon(i, th, bArr);
    }

    @Override // defpackage.InterfaceC9330l
    public int remoteconfig() {
        return 32;
    }

    @Override // defpackage.InterfaceC16013l
    public void yandex(Bitmap bitmap) {
        C0022l c0022l = C9937l.license;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f = width;
            int height = bitmap.getHeight();
            int i = (int) (((9.0f * f) / 16.0f) + 0.5f);
            float f2 = (i - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f2, f, height + f2);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, i, config);
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = bitmapCreateBitmap;
        }
        ((C9937l) this.f30857l).crashlytics(bitmap2, 0);
    }
}
