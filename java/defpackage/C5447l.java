package defpackage;

import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.appbar.MaterialToolbar;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: lؘؖؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5447l extends MaterialToolbar {

    /* JADX INFO: renamed from: lؚؕؒ, reason: contains not printable characters */
    public Field f11673l;

    /* JADX INFO: renamed from: lؘٟۛ, reason: contains not printable characters */
    public TextView f11674l;

    /* JADX INFO: renamed from: lؚۦؑ, reason: contains not printable characters */
    public Field f11675l;

    /* JADX INFO: renamed from: lِٟ, reason: contains not printable characters */
    public Field f11676l;

    /* JADX INFO: renamed from: lًّۥ, reason: contains not printable characters */
    public TextView f11677l;

    /* JADX INFO: renamed from: lٌؚ٘, reason: contains not printable characters */
    public ActionMenuView f11678l;

    public ActionMenuView getCachedMenuView() {
        if (this.f11678l == null) {
            try {
                this.f11678l = (ActionMenuView) this.f11676l.get(this);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return this.f11678l;
    }

    public TextView getSubtitleView() {
        return this.f11677l;
    }

    public TextView getTitleView() {
        return this.f11674l;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
        super.setSubtitle(charSequence);
        try {
            this.f11677l = (TextView) this.f11675l.get(this);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        try {
            this.f11674l = (TextView) this.f11673l.get(this);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
