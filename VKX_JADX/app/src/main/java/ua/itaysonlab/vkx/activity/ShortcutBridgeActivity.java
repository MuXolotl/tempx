package ua.itaysonlab.vkx.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import defpackage.AbstractC10999l;
import defpackage.AbstractC11463l;
import defpackage.AbstractC5563l;
import defpackage.C0469l;
import defpackage.C0786l;
import defpackage.C10892l;
import defpackage.C11294l;
import defpackage.C12393l;
import defpackage.C13305l;
import defpackage.C1412l;
import defpackage.C16287l;
import defpackage.C16534l;
import defpackage.C16931l;
import defpackage.C17972l;
import defpackage.C3151l;
import defpackage.C3887l;
import defpackage.C7226l;
import defpackage.C8634l;
import defpackage.EnumC9342l;
import defpackage.InterfaceC13922l;
import defpackage.InterfaceC14029l;
import defpackage.InterfaceC17817l;
import kotlin.Unit;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ShortcutBridgeActivity extends Activity {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final /* synthetic */ int f36646l = 0;

    public static final Object yandex(ShortcutBridgeActivity shortcutBridgeActivity, InterfaceC17817l interfaceC17817l, AbstractC5563l abstractC5563l) throws Throwable {
        C10892l c10892l = C10892l.yandex;
        c10892l.getClass();
        C8634l c8634l = C10892l.billing;
        InterfaceC13922l interfaceC13922l = C10892l.loadAd[0];
        Object objFirebase = AbstractC10999l.firebase(AbstractC11463l.yandex, new C12393l(new C13305l(null, 0L, null, false, false, ((Boolean) c8634l.pro(c10892l)).booleanValue(), 95), interfaceC17817l, (InterfaceC14029l) null, 2), abstractC5563l);
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (objFirebase != enumC9342l) {
            objFirebase = Unit.INSTANCE;
        }
        return objFirebase == enumC9342l ? objFirebase : Unit.INSTANCE;
    }

    public final void loadAd(InterfaceC17817l interfaceC17817l) {
        VKXApplication vKXApplication = VKXApplication.f36631l;
        InterfaceC14029l interfaceC14029l = null;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        AbstractC10999l.mopub(vKXApplication, null, 0, new C7226l(this, interfaceC17817l, interfaceC14029l, 28), 3);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) AppActivity.class);
        intent.putExtra("from_shortcut", true);
        intent.setAction(getIntent().getAction());
        startActivity(intent);
        if (getIntent().hasExtra("from_shortcut")) {
            Toast.makeText(this, R.string.shortcut_load, 1).show();
        }
        String action = getIntent().getAction();
        if (action != null) {
            switch (action.hashCode()) {
                case -2005101147:
                    if (action.equals("vkx_shortcut_cache")) {
                        loadAd(C3887l.INSTANCE);
                    }
                    break;
                case -1595454980:
                    if (action.equals("vkx_shortcut_recomm")) {
                        C16287l.yandex.getClass();
                        C16534l c16534l = new C16534l(0, 200, C16287l.crashlytics(), (String) null);
                        C3151l c3151l = new C3151l(1, this, ShortcutBridgeActivity.class, "onShortcutError", "onShortcutError(Ljava/lang/Throwable;)V", 0, 0, 7);
                        C16931l c16931l = new C16931l(23, this);
                        C1412l c1412l = new C1412l(10, c16534l);
                        C0786l c0786l = new C0786l(0, c16931l);
                        VKXApplication vKXApplication = VKXApplication.f36631l;
                        if (vKXApplication == null) {
                            vKXApplication = null;
                        }
                        AbstractC10999l.mopub(vKXApplication, null, 0, new C0469l(c0786l, c16534l, c3151l, c1412l, (InterfaceC14029l) null), 3);
                    }
                    break;
                case 601273704:
                    if (action.equals("vkx_shortcut_lib")) {
                        C11294l.Companion.getClass();
                        C16287l.yandex.getClass();
                        loadAd(new C11294l(String.valueOf(C16287l.crashlytics()), C16287l.amazon()));
                    }
                    break;
                case 1553615228:
                    if (action.equals("vkx_shortcut_catalog")) {
                        VKXApplication vKXApplication2 = VKXApplication.f36631l;
                        if (vKXApplication2 == null) {
                            vKXApplication2 = null;
                        }
                        AbstractC10999l.mopub(vKXApplication2, null, 0, new C17972l(this, (InterfaceC14029l) null, 17), 3);
                    }
                    break;
            }
        }
        finish();
    }
}
