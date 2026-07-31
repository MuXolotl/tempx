package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.widget.Toast;
import androidx.car.app.hardware.info.EnergyProfile;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lَ٘ۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17829l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C1930l f34762l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f34763l;

    public /* synthetic */ C17829l(C1930l c1930l, int i) {
        this.f34763l = i;
        this.f34762l = c1930l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f34763l;
        C1930l c1930l = this.f34762l;
        switch (i) {
            case 0:
                c1930l.f4395l.setValue(Boolean.FALSE);
                break;
            case 1:
                c1930l.f4395l.setValue(Boolean.TRUE);
                break;
            case 2:
                try {
                    C10086l c10086l = c1930l.f4398l;
                    Boolean bool = Boolean.FALSE;
                    c10086l.setValue(bool);
                    c1930l.f4401l.setValue(bool);
                    Activity activity = c1930l.f5081l;
                    Intent intent = new Intent("android.intent.action.GET_CONTENT");
                    intent.addCategory("android.intent.category.OPENABLE");
                    intent.putExtra("android.content.extra.SHOW_ADVANCED", true);
                    intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"audio/mpeg"});
                    intent.setType("audio/mpeg");
                    activity.startActivityForResult(intent, EnergyProfile.EVCONNECTOR_TYPE_OTHER);
                } catch (ActivityNotFoundException unused) {
                    Toast.makeText(c1930l.f5081l, "Ошибка при открытии системного проводника", 1).show();
                }
                break;
            default:
                c1930l.f4395l.setValue(Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }
}
