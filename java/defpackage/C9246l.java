package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;

/* JADX INFO: renamed from: lٍؑؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9246l extends RippleDrawable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C9735l f19011l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f19012l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19013l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f19014l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9246l(boolean z, int i) {
        super(ColorStateList.valueOf(-16777216), null, z ? new ColorDrawable(-1) : null);
        this.f19013l = i;
        switch (i) {
            case 1:
                super(ColorStateList.valueOf(-16777216), null, z ? new ColorDrawable(-1) : null);
                this.f19012l = z;
                break;
            default:
                this.f19012l = z;
                break;
        }
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        switch (this.f19013l) {
            case 0:
                if (!this.f19012l) {
                    this.f19014l = true;
                }
                Rect dirtyBounds = super.getDirtyBounds();
                this.f19014l = false;
                return dirtyBounds;
            default:
                if (!this.f19012l) {
                    this.f19014l = true;
                }
                Rect dirtyBounds2 = super.getDirtyBounds();
                this.f19014l = false;
                return dirtyBounds2;
        }
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        switch (this.f19013l) {
            case 0:
                break;
        }
        return this.f19014l;
    }
}
