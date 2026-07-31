package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: lٍؚؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9381l extends AbstractC2240l {
    @Override // defpackage.AbstractC2240l
    public final InterfaceC13280l loadAd(RandomAccessFile randomAccessFile) throws C13768l, IOException {
        C13698l.m3665switch(randomAccessFile);
        C13698l.m3665switch(randomAccessFile);
        C13698l c13698lM3665switch = C13698l.m3665switch(randomAccessFile);
        while (!"CONT".equals((String) c13698lM3665switch.f26743l)) {
            c13698lM3665switch = C13698l.m3665switch(randomAccessFile);
        }
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) c13698lM3665switch.f26746l));
        String strFirebase = AbstractC14375l.firebase(dataInputStream, AbstractC14375l.smaato(dataInputStream));
        String strFirebase2 = AbstractC14375l.firebase(dataInputStream, AbstractC14375l.smaato(dataInputStream));
        String strFirebase3 = AbstractC14375l.firebase(dataInputStream, AbstractC14375l.smaato(dataInputStream));
        String strFirebase4 = AbstractC14375l.firebase(dataInputStream, AbstractC14375l.smaato(dataInputStream));
        C11927l c11927l = new C11927l();
        try {
            c11927l.billing(c11927l.yandex(EnumC17969l.TITLE, strFirebase.length() == 0 ? strFirebase2 : strFirebase));
            EnumC17969l enumC17969l = EnumC17969l.ARTIST;
            if (strFirebase.length() == 0) {
                strFirebase2 = strFirebase3;
            }
            c11927l.billing(c11927l.yandex(enumC17969l, strFirebase2));
            c11927l.billing(c11927l.yandex(EnumC17969l.COMMENT, strFirebase4));
            return c11927l;
        } catch (C9706l e) {
            C11467l.metrica(e);
            return null;
        }
    }

    @Override // defpackage.AbstractC2240l
    public final C16492l yandex(RandomAccessFile randomAccessFile) throws C13768l, IOException {
        C16492l c16492l = new C16492l();
        C13698l.m3665switch(randomAccessFile);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) C13698l.m3665switch(randomAccessFile).f26746l));
        if (AbstractC14375l.smaato(dataInputStream) == 0) {
            long jRemoteconfig = AbstractC14375l.remoteconfig(dataInputStream) / 1000;
            long jRemoteconfig2 = AbstractC14375l.remoteconfig(dataInputStream) / 1000;
            AbstractC14375l.remoteconfig(dataInputStream);
            AbstractC14375l.remoteconfig(dataInputStream);
            AbstractC14375l.remoteconfig(dataInputStream);
            int iRemoteconfig = ((int) AbstractC14375l.remoteconfig(dataInputStream)) / 1000;
            AbstractC14375l.remoteconfig(dataInputStream);
            AbstractC14375l.remoteconfig(dataInputStream);
            AbstractC14375l.remoteconfig(dataInputStream);
            AbstractC14375l.smaato(dataInputStream);
            AbstractC14375l.smaato(dataInputStream);
            c16492l.amazon = (int) jRemoteconfig2;
            c16492l.firebase = iRemoteconfig;
            c16492l.subs = jRemoteconfig != jRemoteconfig2;
        }
        return c16492l;
    }
}
