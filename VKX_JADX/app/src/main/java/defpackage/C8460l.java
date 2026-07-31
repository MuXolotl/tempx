package defpackage;

import android.content.Context;
import android.graphics.Point;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lٌؙؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8460l extends AbstractC17328l {
    public final int metrica;
    public final Context vip;

    public C8460l(Context context) {
        super(new C4136l[1], new C17246l[1]);
        this.vip = context;
        this.metrica = -1;
    }

    @Override // defpackage.AbstractC17328l
    public final AbstractC4008l admob(Throwable th) {
        return new C13029l("Unexpected decode error", th);
    }

    @Override // defpackage.AbstractC17328l
    public final C4136l billing() {
        return new C4136l(1);
    }

    @Override // defpackage.AbstractC17328l
    public final AbstractC11739l mopub() {
        return new C17246l(this);
    }

    @Override // defpackage.AbstractC17328l
    public final AbstractC4008l subs(C4136l c4136l, AbstractC11739l abstractC11739l, boolean z) {
        C17246l c17246l = (C17246l) abstractC11739l;
        ByteBuffer byteBuffer = c4136l.f8498l;
        byteBuffer.getClass();
        AbstractC12442l.subscription(byteBuffer.hasArray());
        AbstractC12442l.admob(byteBuffer.arrayOffset() == 0);
        try {
            int iMax = this.metrica;
            if (iMax == -1) {
                Context context = this.vip;
                if (context != null) {
                    Point pointAdvert = AbstractC15323l.advert(context);
                    int i = pointAdvert.x;
                    int i2 = pointAdvert.y;
                    C5978l c5978l = c4136l.f8495l;
                    if (c5978l != null) {
                        int i3 = c5978l.f12617for;
                        if (i3 != -1) {
                            i *= i3;
                        }
                        int i4 = c5978l.f12623throw;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                    }
                    iMax = (Math.max(i, i2) * 2) - 1;
                } else {
                    iMax = 4096;
                }
            }
            c17246l.f33469l = AbstractC12148l.purchase(byteBuffer.remaining(), iMax, byteBuffer.array());
            c17246l.f23515l = c4136l.f8496l;
            return null;
        } catch (C17655l e) {
            return new C13029l("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e2) {
            return new C13029l(e2);
        }
    }
}
