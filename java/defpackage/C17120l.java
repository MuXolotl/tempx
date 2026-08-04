package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.renderscript.Type;
import kotlin.Unit;

/* JADX INFO: renamed from: lٗٓ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17120l {
    public final Object admob;
    public final Object amazon;
    public final Object billing;
    public final Object crashlytics;
    public boolean loadAd;
    public final Object mopub;
    public final Object purchase;
    public final long yandex;

    public C17120l(RenderScript renderScript, long j) {
        this.crashlytics = renderScript;
        this.yandex = j;
        this.admob = AbstractC12098l.yandex(-1, 0, null, 6);
        int i = (int) (j >> 32);
        int i2 = (i % 4) + i;
        int i3 = (int) (j & 4294967295L);
        int i4 = (i3 % 4) + i3;
        Allocation allocationCreateTyped = Allocation.createTyped(renderScript, new Type.Builder(renderScript, Element.U8_4(renderScript)).setX(i2).setY(i4).create(), 33);
        this.purchase = allocationCreateTyped;
        allocationCreateTyped.setOnBufferAvailableListener(new Allocation.OnBufferAvailableListener() { // from class: lًؓۚ
            @Override // android.renderscript.Allocation.OnBufferAvailableListener
            public final void onBufferAvailable(Allocation allocation) {
                C17120l c17120l = this.yandex;
                if (c17120l.loadAd) {
                    return;
                }
                allocation.ioReceive();
                AbstractC0676l.billing((C7119l) c17120l.admob, Unit.INSTANCE);
            }
        });
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i4, Bitmap.Config.ARGB_8888);
        this.mopub = bitmapCreateBitmap;
        this.billing = Allocation.createFromBitmap(renderScript, bitmapCreateBitmap);
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
        this.amazon = scriptIntrinsicBlurCreate;
        scriptIntrinsicBlurCreate.setInput(allocationCreateTyped);
    }

    public C17120l(Context context, C16351l c16351l, Long l, Long l2) {
        this.loadAd = true;
        AbstractC1051l.subs(context);
        Context applicationContext = context.getApplicationContext();
        AbstractC1051l.subs(applicationContext);
        this.crashlytics = applicationContext;
        this.billing = l;
        this.mopub = l2;
        if (c16351l != null) {
            this.purchase = c16351l;
            this.loadAd = c16351l.f31975l;
            this.yandex = c16351l.f31976l;
            this.admob = c16351l.f31978l;
            Bundle bundle = c16351l.f31979l;
            if (bundle != null) {
                this.amazon = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
