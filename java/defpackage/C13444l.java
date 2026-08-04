package defpackage;

import android.content.Intent;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lْٕ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13444l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f26382l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C9455l f26383l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f26384l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public File f26385l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13444l(C9455l c9455l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f26384l = i;
        this.f26383l = c9455l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws IOException {
        File file;
        File file2;
        int i = this.f26384l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        C9455l c9455l = this.f26383l;
        switch (i) {
            case 0:
                int i2 = this.f26382l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    File dir = c9455l.f34617l.getDir("ocshare", 0);
                    dir.mkdirs();
                    File file3 = new File(dir, "OcCollectedBugReports.zip");
                    C16552l c16552l = AbstractC11463l.yandex;
                    ExecutorC6708l executorC6708l = ExecutorC6708l.f14063l;
                    C14313l c14313l = new C14313l(file3, null, 0);
                    this.f26385l = file3;
                    this.f26382l = 1;
                    if (AbstractC10999l.firebase(executorC6708l, c14313l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                    file = file3;
                } else {
                    if (i2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    file = this.f26385l;
                    AbstractC2829l.crashlytics(obj);
                }
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("application/zip");
                intent.setFlags(1);
                StringBuilder sb = new StringBuilder("[OrbitCore-CrashReporting] Collected ");
                C15589l c15589l = C5013l.yandex;
                sb.append(C5013l.billing());
                sb.append(" logs for ua.itaysonlab.vkx");
                intent.putExtra("android.intent.extra.TEXT", sb.toString());
                intent.putExtra("android.intent.extra.STREAM", FileProvider.amazon(c9455l.f34617l, file));
                c9455l.isVip().startActivity(Intent.createChooser(intent, c9455l.isVip().getResources().getText(R.string.share)));
                return Unit.INSTANCE;
            default:
                int i3 = this.f26382l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    File dir2 = c9455l.f34617l.getDir("ocshare", 0);
                    dir2.mkdirs();
                    File file4 = new File(dir2, "OcCollectedLogcat.txt");
                    C16552l c16552l2 = AbstractC11463l.yandex;
                    ExecutorC6708l executorC6708l2 = ExecutorC6708l.f14063l;
                    C14313l c14313l2 = new C14313l(file4, null, 1);
                    this.f26385l = file4;
                    this.f26382l = 1;
                    if (AbstractC10999l.firebase(executorC6708l2, c14313l2, this) == enumC9342l) {
                        return enumC9342l;
                    }
                    file2 = file4;
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    file2 = this.f26385l;
                    AbstractC2829l.crashlytics(obj);
                }
                Runtime.getRuntime().exec("logcat -d -f " + file2.getAbsolutePath());
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.setFlags(1);
                intent2.putExtra("android.intent.extra.TEXT", "[OrbitCore-CrashReporting] Logcat for ua.itaysonlab.vkx");
                intent2.putExtra("android.intent.extra.STREAM", FileProvider.amazon(c9455l.f34617l, file2));
                c9455l.isVip().startActivity(Intent.createChooser(intent2, c9455l.isVip().getResources().getText(R.string.share)));
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f26384l) {
            case 0:
                return new C13444l(this.f26383l, interfaceC14029l, 0);
            default:
                return new C13444l(this.f26383l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f26384l) {
            case 0:
                break;
        }
        return ((C13444l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
