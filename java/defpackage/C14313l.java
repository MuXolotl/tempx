package defpackage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٓٞۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14313l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f28018l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ File f28019l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14313l(File file, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f28018l = i;
        this.f28019l = file;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        int i = this.f28018l;
        File file = this.f28019l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                if (file.exists()) {
                    file.delete();
                }
                file.createNewFile();
                C14025l c14025l = C5013l.crashlytics;
                if (c14025l != null) {
                    File file2 = c14025l.toFile();
                    ZipOutputStream zipOutputStream = null;
                    try {
                        ZipOutputStream zipOutputStream2 = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file), 2048));
                        try {
                            if (file2.isDirectory()) {
                                AbstractC16837l.amazon(zipOutputStream2, file2, file2.getParent().length());
                            } else {
                                byte[] bArr = new byte[2048];
                                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file2), 2048);
                                String[] strArr = (String[]) AbstractC12024l.m3338public(file2.getPath(), new String[]{"/"}, 6).toArray(new String[0]);
                                ZipEntry zipEntry = new ZipEntry(strArr.length == 0 ? "" : strArr[strArr.length - 1]);
                                zipEntry.setTime(file2.lastModified());
                                zipOutputStream2.putNextEntry(zipEntry);
                                for (int i2 = bufferedInputStream.read(bArr, 0, 2048); i2 != -1; i2 = bufferedInputStream.read(bArr, 0, 2048)) {
                                    zipOutputStream2.write(bArr, 0, i2);
                                }
                            }
                            zipOutputStream2.close();
                        } catch (Throwable th) {
                            th = th;
                            zipOutputStream = zipOutputStream2;
                            if (zipOutputStream != null) {
                                zipOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return Unit.INSTANCE;
            default:
                AbstractC2829l.crashlytics(obj);
                if (file.exists()) {
                    file.delete();
                }
                return Boolean.valueOf(file.createNewFile());
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f28018l;
        File file = this.f28019l;
        switch (i) {
            case 0:
                return new C14313l(file, interfaceC14029l, 0);
            default:
                return new C14313l(file, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f28018l) {
            case 0:
                break;
        }
        return ((C14313l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
