package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.os.Build;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: renamed from: lَٔٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10295l extends AppCompatImageView {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f20977l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Path f20978l;

    public C10295l(Context context) {
        super(context);
        this.f20978l = new Path();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int iSave = canvas.save();
        if (this.f20977l) {
            int i = Build.VERSION.SDK_INT;
            Path path = this.f20978l;
            if (i >= 28) {
                canvas.clipOutPath(path);
            } else {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            }
        }
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    public Path getClipOutPath() {
        if (this.f20977l) {
            return this.f20978l;
        }
        C8339l.smaato("Not using clip path now!");
        return null;
    }

    public void setClipOut(boolean z) {
        this.f20977l = z;
    }
}
