package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؘُٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11148l extends AbstractC15680l {

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C11390l f22412l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final List f22414l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final C1008l f22411l = AbstractC11190l.yandex("");

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final List f22413l = AbstractC14055l.remoteconfig(new C15288l(this, "search_owned_audios"), new C15288l(this, "search_owned_playlists"), new C15288l(this, "search_owned_albums"));

    public C11148l() {
        VKXApplication vKXApplication = VKXApplication.f36631l;
        String string = (vKXApplication == null ? null : vKXApplication).getString(R.string.fake_catalog_tracks);
        VKXApplication vKXApplication2 = VKXApplication.f36631l;
        String string2 = (vKXApplication2 == null ? null : vKXApplication2).getString(R.string.fake_catalog_playlists);
        VKXApplication vKXApplication3 = VKXApplication.f36631l;
        List listRemoteconfig = AbstractC14055l.remoteconfig(string, string2, (vKXApplication3 != null ? vKXApplication3 : null).getString(R.string.fake_catalog_albums));
        this.f22414l = listRemoteconfig;
        this.f22412l = new C11390l(listRemoteconfig, true, new C13830l(this, 1));
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final void m3042abstract(String str) {
        this.f22411l.smaato(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f22413l) {
            if (obj instanceof AbstractC9694l) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC9694l) it.next()).mo782this();
        }
    }

    @Override // defpackage.AbstractC15680l, defpackage.AbstractC2484l, defpackage.AbstractC17777l
    public final void appmetrica() {
        super.appmetrica();
        this.f22412l.getClass();
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [lِٙ] */
    @Override // defpackage.AbstractC15680l, defpackage.AbstractC2484l
    /* JADX INFO: renamed from: case */
    public final AbstractC14412l mo647case() {
        final int i = 0;
        final int i2 = 1;
        return new C11446l(new C1990l(14), new Function0(this) { // from class: lِٙ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C11148l f23770l;

            {
                this.f23770l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                C11148l c11148l = this.f23770l;
                switch (i3) {
                    case 0:
                        c11148l.m3042abstract("");
                        break;
                    default:
                        c11148l.isVip().onBackPressed();
                        break;
                }
                return Unit.INSTANCE;
            }
        }, null, new C13830l(this, 0), true, true, new Function0(this) { // from class: lِٙ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C11148l f23770l;

            {
                this.f23770l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                C11148l c11148l = this.f23770l;
                switch (i3) {
                    case 0:
                        c11148l.m3042abstract("");
                        break;
                    default:
                        c11148l.isVip().onBackPressed();
                        break;
                }
                return Unit.INSTANCE;
            }
        }, 4);
    }

    @Override // defpackage.AbstractC15680l
    /* JADX INFO: renamed from: import */
    public final void mo2199import(int i, float f) {
        this.f22412l.firebase(i, f);
    }

    @Override // defpackage.AbstractC15680l
    /* JADX INFO: renamed from: new */
    public final List mo2201new() {
        return this.f22413l;
    }

    @Override // defpackage.AbstractC15680l, defpackage.AbstractC2484l, defpackage.AbstractC17777l
    /* JADX INFO: renamed from: strictfp */
    public final void mo1148strictfp() {
        super.mo1148strictfp();
        this.f22412l.getClass();
    }

    @Override // defpackage.AbstractC15680l
    /* JADX INFO: renamed from: super */
    public final List mo2202super() {
        return this.f22414l;
    }

    @Override // defpackage.AbstractC15680l, defpackage.AbstractC2484l
    /* JADX INFO: renamed from: switch */
    public final View mo1149switch(Context context, LayoutInflater layoutInflater) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(this.f22412l.amazon(context, linearLayout), new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(super.mo1149switch(context, layoutInflater), new LinearLayout.LayoutParams(-1, 0, 1.0f));
        return linearLayout;
    }
}
