package ua.itaysonlab.vkxreborn.playback.widget_glance.player_small;

import android.content.Intent;
import android.os.Bundle;
import defpackage.AbstractActivityC14666l;
import defpackage.AbstractC0227l;
import defpackage.AbstractC12846l;
import defpackage.C0741l;
import defpackage.C11404l;
import defpackage.C12183l;
import defpackage.C12418l;
import defpackage.C15578l;
import defpackage.C1698l;
import defpackage.C3445l;
import defpackage.C8339l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class SmallPlayerGlanceConfigurationActivity extends AbstractActivityC14666l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public static final /* synthetic */ int f36845l = 0;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public C12418l f36846l;

    @Override // defpackage.AbstractActivityC14666l, defpackage.AbstractActivityC11746l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        Intent intent = getIntent();
        int i = (intent == null || (extras = intent.getExtras()) == null) ? 0 : extras.getInt("appWidgetId", 0);
        setResult(0, new Intent().putExtra("appWidgetId", i));
        if (i == 0) {
            finish();
            return;
        }
        if (new C12183l(this).loadAd.getAppWidgetInfo(i) == null) {
            C8339l.metrica("Invalid AppWidget ID.");
            return;
        }
        C3445l c3445l = new C3445l(i);
        new C12183l(this);
        C12418l c12418l = new C12418l(this, c3445l);
        this.f36846l = c12418l;
        AbstractC0227l.yandex(this, new C11404l(0, 0, new C1698l(28)), new C11404l(AbstractC0227l.yandex, AbstractC0227l.loadAd, new C1698l(28)));
        AbstractC12846l.yandex(this, new C15578l(-1814777608, true, new C0741l(c12418l, this, i, 19)));
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f36846l = null;
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
    }
}
