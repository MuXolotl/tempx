package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lْٔۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13378l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C14025l f26261l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Context f26262l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13378l(C14025l c14025l, Context context, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f26261l = c14025l;
        this.f26262l = context;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws IOException {
        AbstractC2829l.crashlytics(obj);
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        Uri uriAmazon = FileProvider.amazon(vKXApplication, this.f26261l.toFile());
        Context context = this.f26262l;
        PackageInstaller packageInstaller = context.getPackageManager().getPackageInstaller();
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriAmazon);
        if (inputStreamOpenInputStream == null) {
            return null;
        }
        try {
            long jBilling = AbstractC9334l.billing(context, uriAmazon);
            PackageInstaller.SessionParams sessionParams = new PackageInstaller.SessionParams(1);
            sessionParams.setAppPackageName("ua.itaysonlab.vkx");
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                sessionParams.setInstallReason(4);
            }
            if (i >= 31) {
                sessionParams.setRequireUserAction(2);
            }
            if (i >= 33) {
                sessionParams.setPackageSource(4);
            }
            PackageInstaller.Session sessionOpenSession = packageInstaller.openSession(packageInstaller.createSession(sessionParams));
            OutputStream outputStreamOpenWrite = sessionOpenSession.openWrite("vkx_libota", 0L, jBilling);
            try {
                AbstractC11036l.purchase(inputStreamOpenInputStream, outputStreamOpenWrite);
                sessionOpenSession.fsync(outputStreamOpenWrite);
                Unit unit = Unit.INSTANCE;
                outputStreamOpenWrite.close();
                sessionOpenSession.commit(PendingIntent.getActivity(context, 39727, new Intent(context, (Class<?>) AppActivity.class), AbstractC3058l.ads()).getIntentSender());
                sessionOpenSession.close();
                inputStreamOpenInputStream.close();
                return Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC7876l.loadAd(outputStreamOpenWrite, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC7876l.loadAd(inputStreamOpenInputStream, th3);
                throw th4;
            }
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C13378l(this.f26261l, this.f26262l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C13378l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
