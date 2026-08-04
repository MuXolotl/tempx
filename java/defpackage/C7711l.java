package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lًٕؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7711l extends AbstractC15680l {

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final List f16186l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public C12354l f16187l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final List f16188l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public C10740l f16189l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C4983l f16190l = new C4983l(5, this);

    public C7711l() {
        C1059l c1059l = new C1059l(this);
        C2491l.yandex.getClass();
        this.f16188l = AbstractC14055l.remoteconfig(c1059l, ((Boolean) C2491l.amazon.yandex()).booleanValue() ? new C17284l() : new C6111l());
        VKXApplication.Companion companion = VKXApplication.f36628l;
        this.f16186l = AbstractC14055l.remoteconfig(VKXApplication.Companion.loadAd(R.string.odin_tab_library), VKXApplication.Companion.loadAd(R.string.odin_tab_cache));
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final void m2197abstract() {
        this.f16189l = null;
        View view = ((AbstractC11519l) this.f16188l.get(0)).f5280l;
        if (view == null) {
            view = null;
        }
        ((C12656l) view).setEnabled(true);
        C11560l c11560l = this.f30818l;
        if (c11560l == null) {
            c11560l = null;
        }
        c11560l.setPagingEnabled(true);
        C12354l c12354l = this.f16187l;
        (c12354l != null ? c12354l : null).firebase(0);
        this.f16190l.purchase(false);
    }

    @Override // defpackage.AbstractC15680l, defpackage.AbstractC2484l, defpackage.AbstractC17777l
    public final void appmetrica() {
        super.appmetrica();
        this.f16190l.amazon();
    }

    @Override // defpackage.AbstractC15680l, defpackage.AbstractC2484l
    /* JADX INFO: renamed from: case */
    public final AbstractC14412l mo647case() {
        C12354l c12354l = new C12354l(new C3787l(this, 7), new C3787l(this, 8));
        this.f16187l = c12354l;
        return c12354l;
    }

    @Override // defpackage.AbstractC15680l
    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public final int mo2198goto() {
        VKXApplication.Companion companion = VKXApplication.f36628l;
        return !VKXApplication.Companion.crashlytics() ? 1 : 0;
    }

    @Override // defpackage.AbstractC15680l
    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void mo2199import(int i, float f) {
        C12354l c12354l = this.f16187l;
        if (c12354l == null) {
            c12354l = null;
        }
        AbstractC14412l abstractC14412l = c12354l.purchase;
        ((C11390l) (abstractC14412l != null ? abstractC14412l : null)).firebase(i, f);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ce  */
    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final void m2200instanceof() {
        C5447l c5447l;
        AbstractC14412l abstractC14412l;
        Object c18435l;
        int size = ((ArrayList) ((C18480l) this.f16189l.f21748l).f36087l).size();
        C12354l c12354l = this.f16187l;
        if (c12354l == null) {
            c12354l = null;
        }
        AbstractC14412l abstractC14412l2 = c12354l.billing;
        if (abstractC14412l2 == null) {
            abstractC14412l2 = null;
        }
        C0878l c0878l = (C0878l) abstractC14412l2;
        int i = 0;
        int i2 = 1;
        if (size == 2) {
            ArrayList arrayList = (ArrayList) ((C18480l) this.f16189l.f21748l).f36089l;
            if (Math.max(((Number) arrayList.get(0)).intValue(), ((Number) arrayList.get(1)).intValue()) - Math.min(((Number) arrayList.get(0)).intValue(), ((Number) arrayList.get(1)).intValue()) > 1) {
                C3787l c3787l = new C3787l(this, i);
                C5447l c5447l2 = c0878l.admob;
                if (c5447l2 == null) {
                    c5447l2 = null;
                }
                c5447l2.getMenu().clear();
                C5447l c5447l3 = c0878l.admob;
                if (c5447l3 == null) {
                    c5447l3 = null;
                }
                MenuItem menuItemAdd = c5447l3.getMenu().add(0, 0, 0, "");
                menuItemAdd.setShowAsAction(2);
                C5447l c5447l4 = c0878l.admob;
                if (c5447l4 == null) {
                    c5447l4 = null;
                }
                Resources resources = c5447l4.getResources();
                C5447l c5447l5 = c0878l.admob;
                if (c5447l5 == null) {
                    c5447l5 = null;
                }
                Resources.Theme theme = c5447l5.getContext().getTheme();
                ThreadLocal threadLocal = AbstractC7525l.yandex;
                Drawable drawable = resources.getDrawable(R.drawable.ic_list_outline_28, theme);
                if (drawable != null) {
                    Drawable drawableMutate = drawable.mutate();
                    VKXApplication.Companion companion = VKXApplication.f36628l;
                    drawableMutate.setTint(AbstractC13209l.yandex(R.attr.reborn_title_color));
                } else {
                    drawable = null;
                }
                menuItemAdd.setIcon(drawable);
                C5447l c5447l6 = c0878l.admob;
                if (c5447l6 == null) {
                    c5447l6 = null;
                }
                c5447l6.setOnMenuItemClickListener(new C2683l(i2, c3787l));
            } else {
                c5447l = c0878l.admob;
                if (c5447l == null) {
                    c5447l = null;
                }
                c5447l.getMenu().clear();
            }
        } else {
            c5447l = c0878l.admob;
            if (c5447l == null) {
                c5447l = null;
            }
            c5447l.getMenu().clear();
        }
        C12354l c12354l2 = this.f16187l;
        if (c12354l2 == null) {
            c12354l2 = null;
        }
        if (c12354l2.admob != 0 ? (abstractC14412l = c12354l2.billing) == null : (abstractC14412l = c12354l2.purchase) == null) {
            abstractC14412l = null;
        }
        Context context = this.f34617l;
        try {
            c18435l = (context != null ? context.getResources() : null).getQuantityString(R.plurals.tracks_selected, size, Integer.valueOf(size));
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        if (C1171l.yandex(c18435l) != null) {
            c18435l = String.valueOf(size);
        }
        abstractC14412l.mopub((String) c18435l);
    }

    @Override // defpackage.AbstractC15680l
    /* JADX INFO: renamed from: new, reason: not valid java name */
    public final List mo2201new() {
        return this.f16188l;
    }

    @Override // defpackage.AbstractC17777l
    public final void premium() {
        ((AppActivity) isVip()).yandex().yandex(this.f16190l, this);
        InterfaceC14029l interfaceC14029l = null;
        C14019l c14019l = new C14019l(this, interfaceC14029l, 2);
        C8490l c8490l = AbstractC6025l.yandex;
        C2347l c2347l = new C2347l(new C10424l(AbstractC6025l.loadAd, 26), new C5888l(c14019l, interfaceC14029l, 13), 2);
        C5268l c5268l = this.f34614l;
        AbstractC0622l.startapp(AbstractC14024l.startapp(c2347l, c5268l, EnumC8981l.f18524l), AbstractC11738l.yandex(c5268l));
    }

    @Override // defpackage.AbstractC15680l
    /* JADX INFO: renamed from: super, reason: not valid java name */
    public final List mo2202super() {
        return this.f16186l;
    }
}
